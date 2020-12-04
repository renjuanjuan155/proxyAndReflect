package com.example.aopzhujie.jdkProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * @Description TODO
 * @Date 2020/11/5 15:01
 * @Created by ren
 */
public class Test {
    public static void main(String[] args){
        //创建目标对象
        UserDao userDao = new UserDaoImpl();
        //jdk的动态代理,来实现userDao对象的
        /**
         * newProxyInstance()方法的三个参数
         * loader:类加载器（类的字节码对象）写法固定
         * interfaces得到该对象的实现接口的字节码对象的数组，写法固定
         * 需要一个实现InvocationHandler接口的对象，对目标方法功能管理 就是这样一个对象需要自己手动创建 MyInvacationHandle
         */
        InvocationHandler h = new MyInvacationHandle(userDao);

        //返回的是代理对象
        Object o = Proxy.newProxyInstance(userDao.getClass().getClassLoader(), userDao.getClass().getInterfaces(), h);

        //执行代理对象的方法
        UserDao dao = (UserDao)o;
        dao.add();
        dao.delete();
    }
}
