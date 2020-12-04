package com.example.aopzhujie.jdkProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @Description TODO
 * @Date 2020/11/5 15:06
 * @Created by ren
 */
//该类是要对目标对象进行代理、并进行功能增强的具体实现类
public class MyInvacationHandle implements InvocationHandler {

    //1、把目标对象传进来
    //定义目标对象，写一个构造方法传过来目标对象
    Object object;
    public MyInvacationHandle(Object object){
        super();
        this.object = object;
    }

    /**
     *
     * @param proxy 被代理的对象（目标对象）
     * @param method 目标对象中的方法，jdk传过来
     * @param args 方法对象的参数
     * @return
     * @throws Throwable
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        //过滤对那些方法进行增强
        if (method.getName().equals("add")){
          //在目标对象方法执行前后可以追加功能
          System.out.println("哈哈哈哈哈");
          //执行目标对象的方法a
          Object invoke = method.invoke(object, args);
          System.out.println("哈哈哈哈哈333333333");
          return invoke;
      }else {
          Object invoke = method.invoke(object, args);
          return invoke;
      }

    }
}
