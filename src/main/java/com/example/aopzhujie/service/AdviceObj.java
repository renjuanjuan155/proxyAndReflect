package com.example.aopzhujie.service;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

/**
 * @Description TODO
 * @Date 2020/11/5 14:31
 * @Created by ren
 */
@Component
@Aspect
public class AdviceObj {

    @Before(value = "execution(* *..*.method())")
    public  void before(){
        System.out.println("before......111");
    }
}
