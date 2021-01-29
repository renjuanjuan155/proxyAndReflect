package com.example.aopzhujie.service;

import com.example.aopzhujie.mapper.LdcUserResourceMapper;
import com.example.aopzhujie.model.LdcCourseVip;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/**
 * @Description
 * @Date 2021/1/14 17:56
 * @Created by meijunjie
 */
@Service("ldcCourseAdminServiceImpl")
public class LdcCourseAdminServiceImpl {

    @Autowired
    private LdcUserResourceMapper ldcUserResourceMapper;


    public void get() {
        List<Long> list=new ArrayList<Long>();
        List<Long> userId = ldcUserResourceMapper.getUserId();
        List<Long> vipId = ldcUserResourceMapper.getVipId();
        HashSet h1 = new HashSet(userId);
        HashSet h2 = new HashSet(vipId);

        list.addAll(h1);
        boolean b = h1.removeAll(h2);

        for (Long uid:list){
            List<Long> recourse = ldcUserResourceMapper.getRecourse(uid);
            for (Long recId:recourse){
                List<Long> courseId = ldcUserResourceMapper.getCourseId(recId);
                for (Long id:courseId){
                    LdcCourseVip ldcCourseVip = new LdcCourseVip();
                    ldcCourseVip.setCouresId(id);
                    ldcCourseVip.setVipId(uid);
                    ldcUserResourceMapper.getintert(ldcCourseVip);
                }
            }
        }
    }
}
