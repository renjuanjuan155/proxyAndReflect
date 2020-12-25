package com.example.aopzhujie.produceAndConsumer;

import lombok.Data;

/**
 * @Description
 * @Date 2020/12/25 15:14
 * @Created by meijunjie
 */
@Data
public class Goods {

    //商品名称
    private String goodsName;

    //商品数量
    private int count;

    //生产方法
    public synchronized void set(String goodsName) throws InterruptedException {
        if (count > 0){
            System.out.println("有库存,等待消费");
            wait();
        }
        this.goodsName = goodsName;
        this.count = count+1;
        Thread.sleep(1000);
        System.out.println(Thread.currentThread().getName());
        System.out.println("生产:"+toString());
        notifyAll();
    }

    //消费方法
    public synchronized void get() throws InterruptedException {
        if (count == 0){
            System.out.println("没有库存,线程休眠,等待中.....");
            wait();
        }
        //每次消费一个商品
        this.count =count-1;
        Thread.sleep(1000);
        System.out.println(Thread.currentThread().getName());
        System.out.println("消费"+toString());
        //库存为0,唤醒生产线程开始生产
        notifyAll();
    }
}
