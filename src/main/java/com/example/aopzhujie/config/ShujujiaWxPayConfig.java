package com.example.aopzhujie.config;

import com.example.aopzhujie.util.RRException;
import com.github.wxpay.sdk.WXPayConfig;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

/**
 * @Description
 * @Date 2020/12/15 11:41
 * @Created by meijunjie
 */
public class ShujujiaWxPayConfig implements WXPayConfig {

    private String appID;
    private String mchID;
    private String key;

    private static String certPathByDp = "D:/config-shujujia/wxpay_1489140422_cert.p12";      //windos证书地址
    private static String certPathByOpt = "/opt/config-shujujia/wxpay_1489140422_cert.p12";   //centos证书地址

    private byte[] certData;

    public ShujujiaWxPayConfig() throws Exception {

        File fileCert = new File(certPathByDp);
        if (!fileCert.exists()) {
            fileCert = new File(certPathByOpt);
        }
        if (!fileCert.exists()) {
            throw new RRException("微信支付证书不存在: windows " + certPathByDp + " linux " + certPathByOpt);
        }

        InputStream certStream = new FileInputStream(fileCert);
        this.certData = new byte[(int) fileCert.length()];
        certStream.read(this.certData);
        certStream.close();
    }

    public InputStream getCertStream() {
        ByteArrayInputStream certBis = new ByteArrayInputStream(this.certData);
        return certBis;
    }

    public int getHttpConnectTimeoutMs() {
        return 8000;
    }

    public int getHttpReadTimeoutMs() {
        return 10000;
    }

    @Override
    public String getAppID() {
        return appID;
    }

    public void setAppID(String appID) {
        this.appID = appID;
    }

    @Override
    public String getMchID() {
        return mchID;
    }

    public void setMchID(String mchID) {
        this.mchID = mchID;
    }

    @Override
    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }
}
