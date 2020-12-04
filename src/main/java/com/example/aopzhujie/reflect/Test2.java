package com.example.aopzhujie.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * @Description TODO
 * @Date 2020/11/5 16:42
 * @Created by ren
 */
public class Test2 {

    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InvocationTargetException, InstantiationException {
        //用字节码文件对象来创建一个类对象
        //这种用字符串的方式最常用,得到字节码文件对象
        Class<?> clazz = Class.forName("com.example.aopzhujie.reflect.Person");

        //得到字节码文件对象中的构造器
        Constructor<?>[] constructors = clazz.getConstructors();
        System.out.println(constructors.length);//2
        System.out.println(constructors[0]);
        System.out.println(constructors[1]);
        Constructor<?> c = constructors[0];
        //用构造器对象创建类的对象
        Object o = c.newInstance();
        Person person = (Person) o;
        person.eat();
    }
}
