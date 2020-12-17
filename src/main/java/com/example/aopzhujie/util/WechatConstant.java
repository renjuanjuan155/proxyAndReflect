package com.example.aopzhujie.util;

public class WechatConstant {
    public static String THIRD_PARTY_LOGIN_WEIBO_GETUID = "https://api.weibo.com/oauth2/get_token_info";

    public static String THIRD_PARTY_LOGIN_WEIBO = "https://api.weibo.com/2/users/show.json";

    public static String THIRD_PARTY_LOGIN_WECHAT = "https://api.weixin.qq.com/sns/userinfo";

    public static String WX_SMALLPROGRAM_LOGIN = "https://api.weixin.qq.com/sns/jscode2session";

    public static String WX_SMALLPROGRAM_APPID = "wx268066cdd4cbe28c";

    public static String WX_SMALLPROGRAM_APPSECRET = "cff5302e12fd9060388a2a0772361e87";

    public static String THIRD_PARTY_LOGIN_WECHAT_CODE = "https://api.weixin.qq.com/sns/oauth2/access_token";

    public static final String WX_THIRDPART_APPID = "wxab66007b9279a598";

    public static final String WX_THIRDPART_APPSECRET = "23c219b83d053b7092c1b48b7d4eb611";

    public static String getWechatInfo(String code){
        String url = THIRD_PARTY_LOGIN_WECHAT_CODE+"?appid="+WX_THIRDPART_APPID+"&secret="+WX_THIRDPART_APPSECRET+"&code="+code+"&grant_type=authorization_code";
        String resultStr = HttpUtil.sendGet(url);
        return resultStr;
    }
}
