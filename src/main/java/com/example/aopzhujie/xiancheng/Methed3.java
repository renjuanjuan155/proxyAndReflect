package com.example.aopzhujie.xiancheng;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * @author Leo
 * @date 2021/3/29
 */
public class Methed3 {

    public static void main(String[] args) {
        //利用Executors线程调度器来实现  ---Executors是调度器对线程池进行管理
        ExecutorService executorService = Executors.newCachedThreadPool();//创建一个线程池，里边添有三个空线程

        implCall liuxiang = new implCall();//实例化Callable对象
        implCall wanghaoxin = new implCall();
        implCall lufei = new implCall();
        implCall ccc = new implCall();
        //Future用于接收线程内部call方法的返回值
        //将这个对象扔到线程池中，线程池自动分配一个线程来运行liuxiang这个对象的call方法
        Future<Object> future = executorService.submit(liuxiang);
        Future<Object> future2 = executorService.submit(wanghaoxin);
        Future<Object> future3 = executorService.submit(lufei);
        Future<Object> submit = executorService.submit(ccc);
        //此时线程池容量大小是3，再往线程池中添加时会报错

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }finally{
            executorService.shutdown();//关闭线程池释放所有资源
        }
        try {
            System.out.println("累计跑了" + future.get());
            System.out.println("累计跑了" + future2.get());
            System.out.println("累计跑了" + future3.get());
            System.out.println("累计跑了" + submit.get());
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

}

