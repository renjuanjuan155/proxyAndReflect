package com.example.aopzhujie.produceAndConsumer;

/**
 * @Description
 * @Date 2020/12/11 10:45
 * @Created by meijunjie
 */
public class TestThread {

    public static void main(String[] args) throws InterruptedException {
        Object object = new Object();
        MyThread waitThread = new MyThread(true, object);
        MyThread notifyThread = new MyThread(false, object);
        Thread thread1 = new Thread(waitThread, "wait线程");
        Thread thread2 = new Thread(notifyThread, "notify线程");
        thread1.start();
        Thread.sleep(1000);
        thread2.start();
        System.out.println("main方法结束...");
    }
}
