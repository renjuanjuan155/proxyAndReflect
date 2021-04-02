package com.example.aopzhujie.volatilePackge;

import java.util.concurrent.TimeUnit;





/**
 * @author Leo
 * @date 2021/3/24
 */
public class VolatileDemo {
      int number =0;
    public void addData(){
        number = 60;
    }
    public void addplus(){
        number ++;
    }

     class ThreadA  implements Runnable{

        @Override
        public void run() {

            System.out.println(Thread.currentThread().getName()+"\t come in");
            try {
                TimeUnit.SECONDS.sleep(3);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            addData();

            System.out.println(Thread.currentThread().getName()+"\t update number value:"+number);
        }
    }
    class ThreadB implements Runnable{

        @Override
        public void run() {

        }
    }
    public static void main(String[] args) {//主方法是一切方法的入口

        VolatileDemo volatileDemo = new VolatileDemo();


        Thread  threadA = new Thread(volatileDemo.new ThreadA());

        threadA.start();


        Thread  threadB = new Thread(volatileDemo.new ThreadB());

        while (volatileDemo.number ==0 ){

            System.out.println(volatileDemo.number);
        }
        System.out.println(Thread.currentThread().getName()+"\t mission over main get number value:" + volatileDemo.number);

    }
}
