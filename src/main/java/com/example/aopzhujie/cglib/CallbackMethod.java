package com.example.aopzhujie.cglib;

import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @Description TODO
 * @Date 2020/11/5 15:34
 * @Created by ren
 */
public class CallbackMethod implements MethodInterceptor {


    /**
     *
     * @param o 代理对象
     * @param method 目标对象中的方法
     * @param objects 目标对象中的方法参数
     * @param methodProxy 代理对象中的代理方法对象
     * @return
     * @throws Throwable
     */
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("前置增强");
        //执行拦截的方法
        Object o1 = methodProxy.invokeSuper(o, objects);
        System.out.println("后置增强");
        return o1;
    }
}
