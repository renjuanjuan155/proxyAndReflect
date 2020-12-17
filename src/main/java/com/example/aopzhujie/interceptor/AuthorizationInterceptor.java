package com.example.aopzhujie.interceptor;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.example.aopzhujie.annotation.IgnoreAuth;
import com.example.aopzhujie.annotation.OpenAuth;
import com.example.aopzhujie.api.TokenApi;
import com.example.aopzhujie.cooki.Cookies;
import com.example.aopzhujie.cooki.LdcCookie;
import com.example.aopzhujie.model.PortalOpenapiReport;
import com.example.aopzhujie.util.ConstantsUtil;
import com.example.aopzhujie.util.HttpContextUtils;
import com.example.aopzhujie.util.Md5Util;
import com.example.aopzhujie.util.R;
import com.example.aopzhujie.util.redis.RedisBizUtilApi;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @Description
 * @Date 2020/12/15 10:44
 * @Created by meijunjie
 */
@Component
public class AuthorizationInterceptor extends HandlerInterceptorAdapter {

    @Autowired
    private Cookies cookiess;

    public static final String LOGIN_USER_JOB_NUMBER = "LOGIN_USER_JOB_NUMBER";

    @Autowired
    private RedisBizUtilApi redisBizUtilApi;

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        Cookie[] cookies = request.getCookies();
        if (cookies != null && cookies.length != 0) {
            for (Cookie cookie : cookies) {
                if (cookie.getName().equals("userId")) {

                    LdcCookie ldcCookie = new LdcCookie();
                    ldcCookie.setName(cookie.getName());
                    ldcCookie.setValue(cookie.getValue());
                    cookiess.setCookie(ldcCookie);

                }
            }
        }
        IgnoreAuth annotation;
        OpenAuth openAuthAnnotation;
        if (handler instanceof HandlerMethod) {
            annotation = ((HandlerMethod) handler).getMethodAnnotation(IgnoreAuth.class);
            openAuthAnnotation = ((HandlerMethod) handler).getMethodAnnotation(OpenAuth.class);
        } else {
            return true;
        }


        // 1.如果有@IgnoreAuth注解，则不验证token ，完全开放接口，慎用！
        if (annotation != null) {
            return true;
        }

        // 2.如果有@OpenAuth注解，则校验sign，业务系统对接接口
        if (openAuthAnnotation != null) {
            return checkOpenApiAuth(request, response);
        }
        return super.preHandle(request, response, handler);
    }

    /**
     * 如果有@OpenAuth注解，则校验sign，业务系统对接接口
     * GET方式请求openApiCode=OPENAPI_000001，POST方式请求在开放接口中配置新的openApiCode（参数顺序必须固定）
     *
     * @param request
     * @param response
     * @return
     * @throws Exception
     */
    private boolean checkOpenApiAuth(HttpServletRequest request, HttpServletResponse response) throws Exception {
        String openApiCode = request.getParameter("openApiCode");
        String sign = request.getParameter("sign");
        if (StringUtils.isBlank(openApiCode)) {
            response.getWriter().write(JSON.toJSONString(R.error(ConstantsUtil.ExceptionCode.NULL_ERROR, "openApiCode不能为空")));
            return false;
        }
        // 从redis中查询key信息
        String openApiJsonStr = redisBizUtilApi.getPortalOpenApiReport(openApiCode);
        PortalOpenapiReport portalOpenapiReport = null;
        if (StringUtils.isBlank(openApiJsonStr)) {
            response.getWriter().write(JSON.toJSONString(R.error(ConstantsUtil.ExceptionCode.NULL_ERROR, "接口配置不存在")));
            return false;
        } else {
            portalOpenapiReport = JSONObject.parseObject(openApiJsonStr, PortalOpenapiReport.class);
            if (portalOpenapiReport == null) {
                response.getWriter().write(JSON.toJSONString(R.error(ConstantsUtil.ExceptionCode.NULL_ERROR, "openApiCode不存在")));
                return false;
            } else if (portalOpenapiReport.getKey() == null || portalOpenapiReport.getKey().equals("")) {
                //完全开放接口，不做请求数据校验
                return true;
            } else {
                if (StringUtils.isBlank(sign)) {
                    response.getWriter().write(JSON.toJSONString(R.error(ConstantsUtil.ExceptionCode.NULL_ERROR, "sign不能为空")));
                    return false;
                }
                //获取请求参数，并转成这种格式“shppID=9318&barcode=2304348000004”,参数为空也要写成“shppID=”这种
                String parameter = null;
                try {
                    parameter = HttpContextUtils.getParameterForSign(request, portalOpenapiReport);
                } catch (Exception e) {
                    response.getWriter().write(JSON.toJSONString(R.error(ConstantsUtil.ExceptionCode.PORTAL_ERROR, "参数解析异常，请检查平台接口配置")));
                    return false;
                }
                if (StringUtils.isBlank(parameter)) {
                    response.getWriter().write(JSON.toJSONString(R.error(ConstantsUtil.ExceptionCode.NULL_ERROR, "请求参数不能为空")));
                    return false;
                }

                return checkSign(response, sign, portalOpenapiReport.getKey(), parameter);
            }
        }
    }

    /**
     * 用户登陆状态token
     *
     * @param request
     * @param response
     * @return
     * @throws Exception
     */
    private boolean checTokenApiAuth(HttpServletRequest request, HttpServletResponse response) throws Exception {
        // 从header中获取token
        String token = request.getHeader("token");
        // 如果header中不存在token，则从参数中获取token
        if (StringUtils.isBlank(token)) {
            token = request.getParameter("token");
        }
        if (StringUtils.isBlank(token)) {
            response.getWriter().write(JSON.toJSONString(R.error(ConstantsUtil.ExceptionCode.TO_LOGIN, "token不能为空,请尝试登录")));
            return false;
        }
        // 从redis中查询token信息
        String tokenJsonStr = redisBizUtilApi.getApiToken(token);
        TokenApi tokenApi = null;
        if (StringUtils.isBlank(tokenJsonStr)) {
            response.getWriter().write(JSON.toJSONString(R.error(ConstantsUtil.ExceptionCode.TO_LOGIN, "token不存在，请尝试登录")));
            return false;
        } else {
            tokenApi = JSONObject.parseObject(tokenJsonStr, TokenApi.class);
            if (tokenApi == null || tokenApi.getExpireTime().getTime() < System.currentTimeMillis()) {
                response.getWriter().write(JSON.toJSONString(R.error(ConstantsUtil.ExceptionCode.TO_LOGIN, "token已失效，重新登录")));
                return false;
            }
        }
        //设置账户到request里，后续根据jobNumber，获取用户信息
        request.setAttribute(LOGIN_USER_JOB_NUMBER, tokenApi.getJobNumber());
        return true;
    }

    /**
     * 验签
     *
     * @param response
     * @param sign      签名参数
     * @param key       秘钥
     * @param parameter 业务请求参数
     * @return 验签结果
     * @throws Exception
     */
    private boolean checkSign(HttpServletResponse response, String sign, String key, String parameter) throws Exception {
        Md5Util util = new Md5Util();
        //md5加密字符串为：key + parameter + key
        String originSign = util.getMd5("MD5", 0, null, key + parameter + key);
        if (!originSign.equals(sign)) {
            response.getWriter().write(JSON.toJSONString(R.error(ConstantsUtil.ExceptionCode.SIGN_ERROR, "sign验证失败")));
            return false;
        } else {
            return true;
        }
    }
}
