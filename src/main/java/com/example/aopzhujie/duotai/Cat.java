package com.example.aopzhujie.duotai;

/**
 * @Description
 * @Date 2021/1/13 16:21
 * @Created by meijunjie
 */
public class Cat extends Animal {

    @Override
    public void dosomething() {
        System.out.println("喵喵");
    }

    public void run(){
        System.out.println("猫跑");
    }

}
