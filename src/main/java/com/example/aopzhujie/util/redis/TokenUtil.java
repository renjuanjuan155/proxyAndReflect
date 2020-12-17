package com.example.aopzhujie.util.redis;

import com.alibaba.fastjson.JSONObject;
import com.example.aopzhujie.api.TokenApi;
import com.example.aopzhujie.util.RandomNumString;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;
import java.util.Map;

import static org.apache.shiro.web.filter.mgt.DefaultFilter.user;

/**
 * token管理
 *
 * @author 张海 2017.05.13
 */

public class TokenUtil {
    Logger log = Logger.getLogger(this.getClass());
    //12小时后过期
    private final static int EXPIRE = 3600 * 2;
    /*@Reference
    private TokenApiService tokenApiService;*/
    @Autowired
    private RedisBizUtilApi redisBizUtil;

    /**
     * 创建token，用户首次登陆或者上次token已失效，则返回新的token
     * 用户已登陆并且token未失效，直接返回上次的token
     *
     * @param tokenApiLast
     * @return
     */
    public TokenApi createToken(TokenApi tokenApiLast, Map<String, Object> map) {
        if (tokenApiLast == null) {
            return getNewTokenApi(map);
        } else {
            if (tokenApiLast.getExpireTime().getTime() < System.currentTimeMillis()) {
                // token已失效，重新登录，先删除上次登陆保存的token
                redisBizUtil.removeApiToken(tokenApiLast.getToken());
//                tokenApiService.deleteByJobNumber(map.get("id").toString());
                return getNewTokenApi(map);
            } else {
                // token未失效，直接返回
                return tokenApiLast;
            }
        }
    }

    /**
     * 生成新的token
     *
     * @return
     */
    private TokenApi getNewTokenApi(Map<String, Object> map) {
        TokenApi tokenApiNew = new TokenApi();
        // 生成60位长度token，返回给客户端，以后每次请求在header里面带上
        String token = RandomNumString.createToken(map.get("id").toString(), 60);
        // 将token，和用户信息存放到redis
        Date now = new Date();
        // 设置过期时间
        Date expireTime = new Date(now.getTime() + EXPIRE * 1000);
        tokenApiNew.setUpdateTime(now);
        tokenApiNew.setExpireTime(expireTime);
        tokenApiNew.setToken(token);
        tokenApiNew.setJobNumber(map.get("id").toString());
        tokenApiNew.setName(map.get("name").toString());
        if (!"".equals(map.get("avatar")) && map.get("avatar") != null) {
            tokenApiNew.setAvatar(map.get("avatar").toString());
        }
        if (!"".equals(map.get("mobile")) && map.get("mobile") != null) {
            tokenApiNew.setMobile(map.get("mobile").toString());
        }
        // 保存用户token信息
        redisBizUtil.setApiToken(token, JSONObject.toJSONString(tokenApiNew));
        // 保存用户信息到redis
        redisBizUtil.setUserInfo(map.get("id").toString(), JSONObject.toJSONString(user));
//        tokenApiService.save(tokenApiNew);
        // 返回新的token对象
        return tokenApiNew;
    }

}