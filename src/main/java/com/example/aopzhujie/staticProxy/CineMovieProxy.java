package com.example.aopzhujie.staticProxy;

/**
 * @Description
 * @Date 2021/1/7 9:54
 * @Created by meijunjie
 */
public class CineMovieProxy implements Movie {

    private RealMovie realMovie;

    public CineMovieProxy(RealMovie realMovie){
        super();
        this.realMovie=realMovie;
    }
    @Override
    public void play() {

        playMovie(true);
        realMovie.play();
        playMovie(false);
    }

    public void playMovie(Boolean flag){
        if (flag){
            System.out.println("播放电影前插播广告");
        }else {
            System.out.println("播放电影后插播广告");
        }
    }

}
