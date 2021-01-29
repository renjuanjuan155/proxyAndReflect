package com.example.aopzhujie.staticProxy;

/**
 * @Description
 * @Date 2021/1/7 9:57
 * @Created by meijunjie
 */
public class TestStaticProxy {

    public static void main(String[] args) {
        RealMovie realMovie = new RealMovie();

        Movie movie = new CineMovieProxy(realMovie);
        movie.play();

    }
}
