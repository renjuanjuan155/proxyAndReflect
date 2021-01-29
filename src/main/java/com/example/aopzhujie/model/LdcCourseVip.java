package com.example.aopzhujie.model;

import lombok.Data;

import java.util.Date;

/**
 * @Description
 * @Date 2021/1/14 17:55
 * @Created by meijunjie
 */
@Data
public class LdcCourseVip {
    //主键
    private Long id;
    //课程ID
    private Long couresId;
    //vip会员（学员、老师）ID
    private Long vipId;
    //创建时间
    protected Date createTime = null;
}
