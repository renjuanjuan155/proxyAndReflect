package com.example.aopzhujie.util;

/**
 * @描述 Html符号转义工具类
 * @创建人 Kevin.Liao
 * @邮箱 kevin.qingwang.liao@gmail.com
 * @创建时间 2018/5/29 13:23
 */
public class HtmlTagsUtil {

    /*public static String decodeHtml(String htmls) {
        if(htmls.length() == 0) return "";
        htmls = htmls.replace("& amp;","&");
        htmls = htmls.replace("& lt;","<");
        htmls = htmls.replace("& gt;",">");
        htmls = htmls.replace("& nbsp;","&nbsp;");
        htmls = htmls.replace("& #39;","\'");
        htmls = htmls.replace("& quot;","\"");
        htmls = htmls.replace("& #40;","(");
        htmls = htmls.replace("& #41;",")");
        return htmls;
    }*/

    public static String decodeHtml(Object htmls) {
        String str = htmls == null ? null : htmls.toString().replace("&nbsp;", " ");
        return str;
    }
    public static String decodeHtmlLt(Object htmls) {
        String str = htmls == null ? null : htmls.toString().replace("&amp;lt;", "<");
        return str;
    }
    public static String decodeHtmlGt(Object htmls) {
        String str = htmls == null ? null : htmls.toString().replace("&amp;gt;", ">");
        return str;
    }
}
