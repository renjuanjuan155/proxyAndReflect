package com.example.aopzhujie.produceAndConsumer;

/**
 * @Description
 * @Date 2020/12/11 10:06
 * @Created by meijunjie
 */
public class MyThread implements Runnable {

    private boolean flag;
    private Object obj;
    @Override
    public void run() {
        if (flag){
            this.waitMethod();
        }else {
            this.notifyAllMethod();
        }
    }

    public void waitMethod() {
        synchronized (obj) {
            try {
                while (true) {
                    System.out.println("wait()方法开始.."+Thread.currentThread().getName());
                    obj.wait();
                    System.out.println("wait()方法结束.."+Thread.currentThread().getName());
                    return;
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public void notifyMethod() {
        synchronized (obj) {
            try {
                System.out.println("notify()方法开始..."+Thread.currentThread().getName());
                obj.notify();
                System.out.println("notify()方法结束..."+Thread.currentThread().getName());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
    public void notifyAllMethod() {
        synchronized (obj) {
            try {
                System.out.println("notify()方法开始..."+Thread.currentThread().getName());
                obj.notifyAll();
                System.out.println("notify()方法结束..."+Thread.currentThread().getName());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public MyThread(){

    }
    public MyThread(boolean flag,Object obj){
        super();
        this.flag = flag;
        this.obj = obj;
    }
}
