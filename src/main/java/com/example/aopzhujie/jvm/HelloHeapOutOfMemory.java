package com.example.aopzhujie.jvm;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description
 * @Date 2020/12/10 18:31
 * @Created by meijunjie
 */
public class HelloHeapOutOfMemory {
    public static void main(String[] args) {
        System.out.println("HelloHeapOutOfMemory");
        List<Person> persons = new ArrayList<Person>();
        int counter = 0;
        while (true){
            persons.add(new Person());
            System.out.println("Instance:"+(++counter));
        }
    }
}
