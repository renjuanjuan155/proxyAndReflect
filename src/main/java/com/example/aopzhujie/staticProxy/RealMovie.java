package com.example.aopzhujie.staticProxy;

/**
 * @Description
 * @Date 2021/1/7 9:53
 * @Created by meijunjie
 */
public class RealMovie implements Movie {
    @Override
    public void play() {
        System.out.println("播放电影");
    }
}
