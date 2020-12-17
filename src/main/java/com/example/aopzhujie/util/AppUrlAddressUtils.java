package com.example.aopzhujie.util;


/**
 * Author : 杨杨
 * Date : 2017/08/16
 * Description :
 */
public class AppUrlAddressUtils {


    public static AppUrlAddressUtils appUrlAddressUtils;

    private static String APP_BASE_URL;

    public AppUrlAddressUtils(String app_base_url) {
        this.APP_BASE_URL=app_base_url;
    }

    public static synchronized AppUrlAddressUtils getInstance(String APP_BASE_URL) {
        if (null == AppUrlAddressUtils.APP_BASE_URL||!AppUrlAddressUtils.APP_BASE_URL.equals(APP_BASE_URL)) {
            appUrlAddressUtils = new AppUrlAddressUtils(APP_BASE_URL);
            initAppUrl();
        }
        return appUrlAddressUtils;
    }

//    APP的常量接口  后期删除以下代码
    //菜单
    public static String APP_BASE_GET_REPORT_URL;      //获取生意概况菜单列表
    public static String APP_BASE_GET_KPI_URL;      //仪表盘列表
    public static String APP_BASE_GET_ANALYSE_URL;      //获取报表菜单列表
    public static String APP_BASE_GET_APP_URL;      //获取专题菜单列表
    //        public  final String APP_BASE_POST_REPORT_URL = APP_BASE_URL + "/report";      //创建生意概况菜单
    public static String APP_BASE_POST_KPI_URL;      //仪表盘
    public static String APP_BASE_POST_ANALYSE_URL;      //创建报表菜单
    public static String APP_BASE_POST_APP_URL;      //创建专题菜单
    //角色
    public static String APP_BASE_GET_ROLE_URL;      //获取角色列表
    public static String APP_BASE_POST_ROLE_URL;      //创建角色
    //菜单与角色
    //角色与菜单
    //群组
    public static String APP_BASE_GET_GROUP_URL;      //获取群组列表
    public static String APP_BASE_POST_GROUP_URL;      //创建群组
    //用户
    public static String APP_BASE_GET_USER_URL;      //获取用户列表
    public static String APP_BASE_POST_USER_URL;      //创建用户

    //工具箱
    public static String APP_BASE_GET_TOOLBOX_URL;      //工具箱
    public static String APP_BASE_POST_TOOLBOX_URL;      //工具箱

    //用户与角色
    public static void initAppUrl() {
        //APP的常量接口
        //菜单
        APP_BASE_GET_REPORT_URL = APP_BASE_URL + "/reports";      //获取生意概况菜单列表
        APP_BASE_GET_KPI_URL = APP_BASE_URL + "/kpis";      //仪表盘列表
        APP_BASE_GET_ANALYSE_URL = APP_BASE_URL + "/analyses";      //获取报表菜单列表
        APP_BASE_GET_APP_URL = APP_BASE_URL + "/apps";      //获取专题菜单列表
        //        public  final String APP_BASE_POST_REPORT_URL = APP_BASE_URL + "/report";      //创建生意概况菜单
        APP_BASE_POST_KPI_URL = APP_BASE_URL + "/kpi";      //仪表盘
        APP_BASE_POST_ANALYSE_URL = APP_BASE_URL + "/analyse";      //创建报表菜单
        APP_BASE_POST_APP_URL = APP_BASE_URL + "/app";      //创建专题菜单
        //角色
        APP_BASE_GET_ROLE_URL = APP_BASE_URL + "/roles";      //获取角色列表
        APP_BASE_POST_ROLE_URL = APP_BASE_URL + "/role";      //创建角色
        //菜单与角色
        //角色与菜单
        //群组
        APP_BASE_GET_GROUP_URL = APP_BASE_URL + "/groups";      //获取群组列表
        APP_BASE_POST_GROUP_URL = APP_BASE_URL + "/group";      //创建群组
        //用户
        APP_BASE_GET_USER_URL = APP_BASE_URL + "/users";      //获取用户列表
        APP_BASE_POST_USER_URL = APP_BASE_URL + "/user";      //创建用户
        //用户与角色

        APP_BASE_GET_TOOLBOX_URL=APP_BASE_URL+"/list/toolbox";
        APP_BASE_POST_TOOLBOX_URL=APP_BASE_URL+"/toolbox";
    }

}
