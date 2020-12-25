package com.example.aopzhujie.produceAndConsumer;

/**
 * @Description创建生产者
 * @Date 2020/12/25 15:19
 * @Created by meijunjie
 */

public class Producer implements Runnable{

    private Goods goods;

    public Producer(Goods goods){
        super();
        this.goods = goods;
    }
    @Override
    public void run() {
        try {
            this.goods.set("保时捷一辆");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
