//package com.example.aopzhujie.volatilePackge;
//
//import org.apache.poi.ss.formula.functions.T;
//
//import java.util.concurrent.TimeUnit;
//
///**
// * @author Leo
// * @date 2021/3/24
// */
//public class ThreadA  implements Runnable{
//
//    @Override
//    public void run() {
//        MyData myData = new MyData();
//        System.out.println(Thread.currentThread().getName()+"\t come in");
//        try {
//            TimeUnit.SECONDS.sleep(3);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        myData.addData();
//        System.out.println(Thread.currentThread().getName()+"\t update number value:"+myData.number);
//    }
//}
