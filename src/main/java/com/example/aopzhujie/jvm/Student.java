package com.example.aopzhujie.jvm;

/**
 * @Description
 * @Date 2020/12/10 18:25
 * @Created by meijunjie
 */
public class Student {
    // name本身作为成员是放在stack区域的但是name指向的String对象是放在Heap中
    private String name;

    public Student(String name) {
        this.name = name;
    }

    //sayHello这个方法是放在方法区中的
    public void sayHello() {
        System.out.println("Hello, this is " + this.name);

    }
}