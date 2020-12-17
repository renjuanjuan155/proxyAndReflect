package com.example.aopzhujie.controller;

import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description
 * @Date 2020/12/11 16:08
 * @Created by meijunjie
 */
@RestController
@RequestMapping("/admin")
@Api(tags = "登录",description = "denglu ")
public class Hello {

    @RequestMapping("/hello")

    public String hello(){
        return "helo";
    }
}
