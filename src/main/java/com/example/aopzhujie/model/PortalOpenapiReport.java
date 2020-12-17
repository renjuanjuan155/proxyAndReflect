package com.example.aopzhujie.model;

import lombok.Data;

/**
 * @Description
 * @Date 2020/12/15 10:57
 * @Created by meijunjie
 */
@Data
public class PortalOpenapiReport {

    //报表唯一编码，api接口请求必须参数
    private String code;
    //对应的报表编码
    private String reportcode;

    //请求外部接口key值
    private String key;
    //请求外部系统url
    private String url;
    //执行参数，格式如aa@@bb@@cc
    private String parameter;
    //请求外部系统名称
    private String name;
    //标题
    private String title;
}
