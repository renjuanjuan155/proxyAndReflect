package com.example.aopzhujie.xiancheng;

import java.util.Random;
import java.util.concurrent.Callable;

/**
 * @author Leo
 * @date 2021/3/29
 */
public class implCall implements Callable<Object> {
    @Override
    public Object call() throws Exception {
        Integer  speed = new Random().nextInt(100);
        Integer distince = 0 ; //总共奔跑的距离
        for(int i = 0;i< 100 ;i++){
            distince = i*speed;
            //打印当前线程的名字
            System.out.println(Thread.currentThread().getName()+"---已前进--" +(i*speed)+"---速度----"+speed);

        }
        return distince;
    }
}
