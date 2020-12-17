package com.example.aopzhujie.model;

import lombok.Data;

import java.util.List;

/**
 * @Description
 * @Date 2020/12/15 11:21
 * @Created by meijunjie
 */
@Data
public class Menu {

    private String keyword;

    private String name;

    private String pName;

    private String url;

    private Long pid;

    private String icon;

    private Integer status;

    private Integer type;

    private Integer sort;

    private List<Menu> children;

    private List<Long> roleIdList;

    private Boolean open;

    //0启用，1禁用
    protected Long disabled;

    //主键
    private Long id;
}
