package com.example.aopzhujie.produceAndConsumer;

/**
 * @Description
 * @Date 2020/12/11 13:35
 * @Created by meijunjie
 */
public class TestThread2 {
    public static void main(String[] args) throws InterruptedException {
        Object object = new Object();
        MyThread waitThread1 = new MyThread(true, object);
        MyThread waitThread2 = new MyThread(true, object);
        MyThread waitThread3 = new MyThread(true, object);
        MyThread notifyThread = new MyThread(false, object);
        Thread thread1 = new Thread(waitThread1,"wait A 线程");
        Thread thread2 = new Thread(waitThread2,"wait B 线程");
        Thread thread3 = new Thread(waitThread3,"wait C 线程");
        Thread thread4 = new Thread(notifyThread,"notify 线程");

        thread2.start();
        Thread.sleep(1000);
        thread1.start();
        Thread.sleep(1000);
        thread3.start();
        Thread.sleep(1000);
        thread4.start();
        System.out.println("main 方法执行结束");
    }
}
