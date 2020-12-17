package com.example.aopzhujie.config;

import lombok.Data;

/**
 * @Description
 * @Date 2020/12/15 11:39
 * @Created by meijunjie
 */
@Data
public class SysFtpConfig {

    //用户名
    private String username;
    //密码
    private String password;
    //地址
    private String host;
    //端口
    private Integer port;
    private Integer connecttime;

    private String rootpath;

    private String origin;

}
