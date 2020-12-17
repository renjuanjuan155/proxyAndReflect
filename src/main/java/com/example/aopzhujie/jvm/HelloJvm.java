package com.example.aopzhujie.jvm;

/**
 * @Description
 * @Date 2020/12/10 18:22
 * @Created by meijunjie
 */
public class HelloJvm {

    public static void main(String[] args) {

        /**
         * student(小写的)是放在主线程中的Stack区域中的
         * Student对象实例是放在所有线程共享的Heap区域中的
         */
        Student student = new Student("spark");
        /**
         * 首先会通过student指针（或句柄）（指针就直接指向堆中的对象，句柄表明有一个中间的,student指向句柄，句柄指向对象）
         * 找Student对象，当找到该对象后会通过对象内部指向方法区域中的指针来调用具体的方法去执行任务
         */
        student.sayHello();
    }
}
