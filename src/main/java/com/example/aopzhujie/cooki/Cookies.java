package com.example.aopzhujie.cooki;

import org.springframework.stereotype.Component;

/**
 * @Description
 * @Date 2020/12/14 9:41
 * @Created by meijunjie
 */
@Component("Cookies")
public class Cookies {

    /** 当前请求接口的cookies信息 */
    private static ThreadLocal<LdcCookie> cookie = new ThreadLocal<LdcCookie>();


    /*获取请求头中的cookies信息*/
    public static LdcCookie getCookie() {
        return Cookies.cookie.get();
    }

    /*设置cookies信息*/
    public static void setCookie(LdcCookie ldcCookie) {
        Cookies.cookie.set(ldcCookie);
    }
}
