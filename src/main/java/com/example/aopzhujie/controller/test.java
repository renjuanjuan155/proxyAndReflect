package com.example.aopzhujie.controller;

import com.example.aopzhujie.annotation.IgnoreAuth;
import com.example.aopzhujie.service.LdcCourseAdminServiceImpl;
import com.example.aopzhujie.util.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description
 * @Date 2021/1/14 17:57
 * @Created by meijunjie
 */
@RestController
@RequestMapping("ldc/shujuget")
public class test {

    @Autowired
    private LdcCourseAdminServiceImpl ldcCourseAdminService;


    @IgnoreAuth
        @RequestMapping("getshuju")
    public R get(){

        ldcCourseAdminService.get();
        return R.success();
    }
}
