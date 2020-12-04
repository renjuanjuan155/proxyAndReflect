package com.example.aopzhujie.cglib;

import org.springframework.cglib.proxy.Callback;
import org.springframework.cglib.proxy.Enhancer;

/**
 * @Description TODO
 * @Date 2020/11/5 15:32
 * @Created by ren
 */
public class Test {
    /**
     * cglib动态代理实现步骤
     * @param args
     */
    public static void main(String[] args){

        //1、 生成一个字节码对象（空的）
        Enhancer enhancer = new Enhancer();
        //2、 设置字节码对象的父类是目标对象
        enhancer.setSuperclass(Student.class);
        //3、 通过生成的字节码对象进行回调的方法，在回调的过程中增强方法功能
        Callback callback = new CallbackMethod();
        enhancer.setCallback(callback);
        //4、 创建代理对象（完成动态代理），调用代理对象的方法，方法的功能就增强了
        Object o = enhancer.create();

        Student student = (Student) o;
        student.study();
    }

}
