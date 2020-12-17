package com.example.aopzhujie.collection;

import java.util.*;

/**
 * @Description
 * @Date 2020/12/11 9:28
 * @Created by meijunjie
 */
public class Test {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()){
            Integer next = iterator.next();
            if (next == 1){
                iterator.remove();
                System.out.println(next);
            }
        }

        Iterator<Integer> iterator1 = list.iterator();
        while (iterator1.hasNext()){
            Integer next = iterator1.next();
            System.out.println(next);
        }

        Set<String> set = new TreeSet<String>();
        set.add("D");
        // 重复元素
        set.add("D");
        set.add("E");
        set.add("A");
        set.add("C");
        set.add("B");
        System.out.println(set);
    }
}
