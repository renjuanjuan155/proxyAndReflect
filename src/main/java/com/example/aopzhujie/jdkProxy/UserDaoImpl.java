package com.example.aopzhujie.jdkProxy;

/**
 * @Description TODO
 * @Date 2020/11/5 15:00
 * @Created by ren
 */
public class UserDaoImpl implements UserDao {
    @Override
    public void add() {

        System.out.println("111");
    }

    @Override
    public void delete() {

        System.out.println("122");
    }
}
