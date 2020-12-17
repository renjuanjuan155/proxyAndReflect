package com.example.aopzhujie.produceAndConsumer;

/**
 * @Description
 * @Date 2020/12/11 9:56
 * @Created by meijunjie
 */
public class Test {
    public static void main(String[] args) throws InterruptedException {
        Object object = new Object();
        synchronized (object){
            System.out.println("等待中...");
            object.wait();
            System.out.println("等待结束...");
        }
        System.out.println("main方法结束...");
    }
}
