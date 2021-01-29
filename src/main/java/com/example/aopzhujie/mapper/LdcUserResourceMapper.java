package com.example.aopzhujie.mapper;

import com.example.aopzhujie.model.LdcCourseVip;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @Description
 * @Date 2021/1/14 17:54
 * @Created by meijunjie
 */
@Mapper
public interface LdcUserResourceMapper {

    List<Long> getUserId();
    List<Long> getRecourse(Long userId);
    List<Long> getCourseId(Long recourseId);
    int getintert(LdcCourseVip ldcCourseVip);
    List<Long> getVipId();
}
