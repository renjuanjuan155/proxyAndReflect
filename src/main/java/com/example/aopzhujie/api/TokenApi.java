package com.example.aopzhujie.api;

import java.io.Serializable;
import java.util.Date;


/**
 * 用户Token
 */
public class TokenApi implements Serializable {
    private static final long serialVersionUID = 1L;

    //用户ID
    private String jobNumber;
    //token值
    private String token;
    //过期时间
    private Date expireTime;
    //更新时间
    private Date updateTime;
    //用戶姓名
    private String name;

    private String avatar;

    private String mobile;

    public String getJobNumber() {
        return jobNumber;
    }

    public void setJobNumber(String jobNumber) {
        this.jobNumber = jobNumber;
    }

    /**
     * 设置：token
     */
    public void setToken(String token) {
        this.token = token;
    }

    /**
     * 获取：token
     */
    public String getToken() {
        return token;
    }

    /**
     * 设置：过期时间
     */
    public void setExpireTime(Date expireTime) {
        this.expireTime = expireTime;
    }

    /**
     * 获取：过期时间
     */
    public Date getExpireTime() {
        return expireTime;
    }

    /**
     * 设置：更新时间
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * 获取：更新时间
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }
}
