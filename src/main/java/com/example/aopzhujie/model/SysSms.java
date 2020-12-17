package com.example.aopzhujie.model;

import lombok.Data;

/**
 * @Description
 * @Date 2020/12/15 11:24
 * @Created by meijunjie
 */
@Data
public class SysSms {

    //自定义名称
    private String name;
    //平台签名（参数）
    private String signName;
    //平台名称（参数）
    private String product;
    //平台地址（参数）
    private String domain;
    //密钥id
    private String accessKeyId;
    //密钥
    private String accessKeySecret;
    private String typeCode;
}
