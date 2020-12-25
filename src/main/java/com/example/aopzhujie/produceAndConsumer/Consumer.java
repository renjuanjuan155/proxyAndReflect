package com.example.aopzhujie.produceAndConsumer;

/**
 * @Description
 * @Date 2020/12/25 15:23
 * @Created by meijunjie
 */
public class Consumer implements Runnable {

    private Goods goods;

    public Consumer(Goods goods){
        super();
        this.goods = goods;
    }
    @Override
    public void run() {
        try {
            this.goods.get();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
