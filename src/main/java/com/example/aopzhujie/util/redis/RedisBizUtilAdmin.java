package com.example.aopzhujie.util.redis;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * redis业务数据处理
 *
 * @author 张海 2017.05.13
 */
@Component("redisBizUtilAdmin")
public class RedisBizUtilAdmin {

    @Autowired
    private RedisUtilAdmin redisUtil;

    //数据运营平台统一前缀
    private static String KEY_PREFIX = "portal";


    /********************报表sql语句配置信息*****************/
    public void setPortalExecuteSql(String sqlcodeOld, String sqlcode, String value) {
        if (!StringUtils.isEmpty(sqlcodeOld) && !sqlcodeOld.equals(sqlcode)) {
            redisUtil.remove(String.format("%s:report:executesql", KEY_PREFIX), sqlcodeOld);
        }
        redisUtil.put(String.format("%s:report:executesql", KEY_PREFIX), sqlcode, value);
    }

    public String getPortalExecuteSql(String sqlcode) {
        return redisUtil.get(String.format("%s:report:executesql", KEY_PREFIX), sqlcode);
    }

    public void removePortalExecuteSql(String sqlcode) {
        redisUtil.remove(String.format("%s:report:executesql", KEY_PREFIX), sqlcode);
    }

    public boolean hasPortalExecuteSql(String sqlcode) {
        return redisUtil.hasKey(String.format("%s:report:executesql", KEY_PREFIX), sqlcode);
    }

    /********************报表数据源配置信息*****************/
    public void setPortalDataSource(String codeOld, String code, String value) {
        if (!StringUtils.isEmpty(codeOld) && !codeOld.equals(code)) {
            redisUtil.remove(String.format("%s:report:datasource", KEY_PREFIX), codeOld);
        }
        redisUtil.put(String.format("%s:report:datasource", KEY_PREFIX), code, value);
    }

    public String getPortalDataSource(String code) {
        return redisUtil.get(String.format("%s:report:datasource", KEY_PREFIX), code);
    }

    public void removePortalDataSource(String code) {
        redisUtil.remove(String.format("%s:report:datasource", KEY_PREFIX), code);
    }

    public boolean hasPortalDataSource(String code) {
        return redisUtil.hasKey(String.format("%s:report:datasource", KEY_PREFIX), code);
    }

    /********************报表配置信息*****************/
    public void setPortalReport(String codeOld, String code, String value) {
        if (!StringUtils.isEmpty(codeOld) && !codeOld.equals(code)) {
            redisUtil.remove(String.format("%s:report:info", KEY_PREFIX), codeOld);
        }
        redisUtil.put(String.format("%s:report:info", KEY_PREFIX), code, value);
    }

    public String getPortalReport(String code) {
        return redisUtil.get(String.format("%s:report:info", KEY_PREFIX), code);
    }

    public void removePortalReport(String code) {
        redisUtil.remove(String.format("%s:report:info", KEY_PREFIX), code);
    }

    public boolean hasPortalReport(String code) {
        return redisUtil.hasKey(String.format("%s:report:info", KEY_PREFIX), code);
    }

    /********************报表标题列配置信息*****************/
    public void setReportColumns(String code, String value) {
        redisUtil.put(String.format("%s:report:columns", KEY_PREFIX), code, value);
    }

    public String getReportColumns(String code) {
        return redisUtil.get(String.format("%s:report:columns", KEY_PREFIX), code);
    }

    public void removeReportColumns(String code) {
        redisUtil.remove(String.format("%s:report:columns", KEY_PREFIX), code);
    }

    public boolean hasReportColumns(String code) {
        return redisUtil.hasKey(String.format("%s:report:columns", KEY_PREFIX), code);
    }

    /*****************报表模板配置信息*****************/
    public void setPageModule(String code, String value) {
        redisUtil.put(String.format("%s:report:page", KEY_PREFIX), code, value);
    }

    public String getPageModule(String code) {
        return redisUtil.get(String.format("%s:report:page", KEY_PREFIX), code);
    }

    public void removePageModule(String code) {
        redisUtil.remove(String.format("%s:report:page", KEY_PREFIX), code);
    }

    public boolean hasPageModule(String code) {
        return redisUtil.hasKey(String.format("%s:report:page", KEY_PREFIX), code);
    }

    /********************角色菜单配置信息*****************/
    public void setAppRoleMenu(Integer id, String value) {
        redisUtil.put(String.format("%s:app:role:menu", KEY_PREFIX), id.toString(), value);
    }

    public void setPcRoleMenu(Integer id, String value) {
        redisUtil.put(String.format("%s:pc:role:menu", KEY_PREFIX), id.toString(), value);
    }

    public String getRoleMenu(Integer id) {
        return redisUtil.get(String.format("%s:role:menu", KEY_PREFIX), id.toString());
    }

    public void removePcRoleMenu(Integer id) {
        redisUtil.remove(String.format("%s:pc:role:menu", KEY_PREFIX), id.toString());
    }

    public void removeAppRoleMenu(Integer id) {
        redisUtil.remove(String.format("%s:app:role:menu", KEY_PREFIX), id.toString());
    }

    public boolean hasPcRoleMenu(Integer id) {
        return redisUtil.hasKey(String.format("%s:pc:role:menu", KEY_PREFIX), id.toString());
    }

    public boolean hasAppRoleMenu(Integer id) {
        return redisUtil.hasKey(String.format("%s:app:role:menu", KEY_PREFIX), id.toString());
    }

    /********************openapi接口配置*****************/
    public void setOpenApiReport(String codeOld, String code, String value) {
        if (!StringUtils.isEmpty(codeOld) && !codeOld.equals(code)) {
            redisUtil.remove(String.format("%s:penapi:report", KEY_PREFIX), codeOld);
        }
        redisUtil.put(String.format("%s:openapi:report", KEY_PREFIX), code, value);
    }

    public String getOpenApiReport(String code) {
        return redisUtil.get(String.format("%s:openapi:report", KEY_PREFIX), code);
    }

    public void removeOpenApiReport(String code) {
        redisUtil.remove(String.format("%s:openapi:report", KEY_PREFIX), code);
    }

    public boolean hasOpenApiReport(String code) {
        return redisUtil.hasKey(String.format("%s:openapi:report", KEY_PREFIX), code);
    }

    public void setRouteReport(String codeOld, String code, String value) {
        if (!StringUtils.isEmpty(codeOld) && !codeOld.equals(code)) {
            redisUtil.remove(String.format("%s:openapi:route", KEY_PREFIX), codeOld);
        }
        redisUtil.put(String.format("%s:openapi:route", KEY_PREFIX), code, value);
    }

    public String getRouteReport(String code) {
        return redisUtil.get(String.format("%s:openapi:route", KEY_PREFIX), code);
    }

    public void removeRouteReport(String code) {
        redisUtil.remove(String.format("%s:openapi:route", KEY_PREFIX), code);
    }

    public boolean hasRouteReport(String code) {
        return redisUtil.hasKey(String.format("%s:openapi:route", KEY_PREFIX), code);
    }

    /********************FTP配置信息*****************/
    public void setFtpInfo(Long id, String value) {
        redisUtil.put(String.format("%s:sys:ftp", KEY_PREFIX), id.toString(), value);
    }

    public String getFtpInfo(Long id) {
        return redisUtil.get(String.format("%s:sys:ftp", KEY_PREFIX), id.toString());
    }

    public void removeFtpInfo(Long id) {
        redisUtil.remove(String.format("%s:sys:ftp", KEY_PREFIX), id.toString());
    }

    public boolean hasFtpInfo(Long id) {
        return redisUtil.hasKey(String.format("%s:sys:ftp", KEY_PREFIX), id.toString());
    }

    /*****************系统全局参数配置信息*****************/
    public void setSysConfig(String keyOld, String key, String value) {
        if (!StringUtils.isEmpty(keyOld) && !keyOld.equals(key)) {
            redisUtil.remove(String.format("%s:sys:config", KEY_PREFIX), keyOld);
        }
        redisUtil.put(String.format("%s:sys:config", KEY_PREFIX), key, value);
    }

    public String getSysConfig(String key) {
        return redisUtil.get(String.format("%s:sys:config", KEY_PREFIX), key);
    }

    public void removeSysConfig(String key) {
        redisUtil.remove(String.format("%s:sys:config", KEY_PREFIX), key);
    }

    public boolean hasSysConfig(String key) {
        return redisUtil.hasKey(String.format("%s:sys:config", KEY_PREFIX), key);
    }

    /*****************短信平台参数配置信息*****************/
    public void setSysSmsConfig(String key, String value) {
        redisUtil.put(String.format("%s:sys:sms", KEY_PREFIX), key, value);
    }

    public String getSmsConfig(String key) {
        return redisUtil.get(String.format("%s:sys:sms", KEY_PREFIX), key);
    }

    public void removeSmsConfig(String key) {
        redisUtil.remove(String.format("%s:sys:sms", KEY_PREFIX), key);
    }

    public boolean hasSmsConfig(String key) {
        return redisUtil.hasKey(String.format("%s:sys:sms", KEY_PREFIX), key);
    }

}
