package com.example.aopzhujie.produceAndConsumer;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description
 * @Date 2020/12/25 15:24
 * @Created by meijunjie
 */
public class TestProduceAndConsumer {

    public static void main(String[] args) throws InterruptedException {

        Goods goods = new Goods();
        /*Thread produce = new Thread(new Producer(goods),"生产者线程");
        Thread consumer = new Thread(new Consumer(goods),"消费者线程");*/


        List<Thread> list = new ArrayList<Thread>();
        for (int i=1; i<=5; i++){
            Thread produce = new Thread(new Producer(goods),"生产者线程"+i);
            list.add(produce);
        }

        for (int i=1; i<=5; i++){
            Thread consumer = new Thread(new Consumer(goods),"消费者线程"+i);
            list.add(consumer);
        }

        for (Thread thread:list){
            thread.start();
            Thread.sleep(1000);
        }



    }
}
