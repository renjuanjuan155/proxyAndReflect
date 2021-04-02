package com.example.aopzhujie.volatilePackge;

/**
 * @author Leo
 * @date 2021/3/24
 */
public class MyData {
    public volatile int number =0;
    public void addData(){
        this.number = 60;
    }

    public void addplus(){
        number ++;
    }

}
