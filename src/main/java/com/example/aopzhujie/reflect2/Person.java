package com.example.aopzhujie.reflect2;

/**
 * @Description TODO
 * @Date 2020/11/5 16:29
 * @Created by ren
 */
public class Person {

    private String name;
    private int age;

    public Person() {
    }
    private Person(int age){
        this.age = age;
    }
    protected Person(String name){
        this.name = name;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void eat(){
        System.out.println("111111111");
    }



}
