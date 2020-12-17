package com.example.aopzhujie.util.redis;

import com.alibaba.fastjson.JSONObject;
import com.aliyuncs.dysmsapi.model.v20170525.SendSmsResponse;
import com.example.aopzhujie.model.SysSms;
import com.example.aopzhujie.util.ConstantsUtil;
import com.example.aopzhujie.util.RRException;
import com.example.aopzhujie.util.RandomNumString;
import com.example.aopzhujie.util.aliyunSms.aliyunSms;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.concurrent.TimeUnit;

/**
 * 消息处理
 * Created by zhanghai on 2017/5/25.
 *
 * @author zhanghai
 */
@Component("smsUtil")
public class SmsUtil {

    @Autowired
    private RedisBizUtilApi redisBizUtilApi;

    /**
     * 获取平台配置信息
     *
     * @param typeCode
     * @return
     */
    public SysSms getSysSms(String typeCode) {
        if (StringUtils.isEmpty(typeCode)) {
            throw new RRException("短息平台编码不能为空");
        }
        String reportJson = redisBizUtilApi.getSysSms(typeCode);
        if (StringUtils.isEmpty(reportJson)) {
            throw new RRException("编码 " + typeCode + " 无效");
        }
        SysSms sysSms = JSONObject.parseObject(reportJson, SysSms.class);
        if (sysSms == null || StringUtils.isEmpty(sysSms.getTypeCode())) {
            throw new RRException("编码:" + typeCode + " 无效，或未指定typeCode");
        }
        return sysSms;
    }

    /**
     * 发送验证码
     *
     * @param key  手机号，邮箱等唯一主键
     * @param type 1,注册，2找回密码
     * @return 短信发送失败返回null
     */
    public String sendRandomCode(String key, int type) {
        String code = RandomNumString.getRandomNumber(100000).toString();
        // 发送短信
        SysSms sysSms = getSysSms(ConstantsUtil.SysSmsConfig.SMS_TYPE_CODE_ALIYUN);
        String phoneNumbers = key;
        String templateCode = "";
        String templateParam = "";

        if (type == ConstantsUtil.SysSmsConfig.TYPE_ONE) {
            // 用户注册配置
            templateCode = ConstantsUtil.SysSmsConfig.REGISTER_TEMPLATE_CODE;
            templateParam = "{\"code\":\"" + code + "\"}";
        } else if (type == ConstantsUtil.SysSmsConfig.TYPE_TWO) {
            // 密码找回配置
            templateCode = ConstantsUtil.SysSmsConfig.FIND_TEMPLATE_CODE;
            templateParam = "{\"code\":\"" + code + "\"}";
        }

        try {
            SendSmsResponse sendSmsResponse = aliyunSms.sendSms(sysSms, phoneNumbers, templateCode, templateParam);
            if (sendSmsResponse.getCode() != null && ConstantsUtil.SysSmsConfig.OK.equals(sendSmsResponse.getCode())) {
                // 保存验证码有效时间
                redisBizUtilApi.setSmsCode(key, code, ConstantsUtil.SysSmsConfig.SMS_EXT_TIMES, TimeUnit.SECONDS, type);
            } else {
                code = null;
            }
        } catch (Exception e) {
            code = null;
            e.printStackTrace();
        }
        return code;
    }

    /**
     * 获取验证码
     *
     * @param key  手机号，邮箱等唯一主键
     * @param type 1,注册，2找回密码
     * @return
     */
    public String getCode(String key, int type) {
        return redisBizUtilApi.getSmsCode(key, type);
//        return "888888";
    }

}
