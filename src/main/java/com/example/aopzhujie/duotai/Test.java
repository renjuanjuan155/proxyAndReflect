package com.example.aopzhujie.duotai;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @Description
 * @Date 2021/1/13 16:22
 * @Created by meijunjie
 */
public class Test {
    public static void main(String[] args) {
        AnimalDoSomething animalDoSomething = new AnimalDoSomething();
        Dog dog = new Dog();
        Cat cat = new Cat();
        animalDoSomething.animalDoSomething(dog);
        animalDoSomething.animalDoSomething(cat);
        animalDoSomething.animalRun(dog);

        Map<String,String> map1 = new HashMap<String, String>();
        Map<String,String> map2 = new HashMap<String, String>();
        map1.put("name","zhangsna");
        map1.put("age","12");
        map2.put("name","lisi");
        map2.put("age","19");
        Set<String> keySet = map1.keySet();
        for (String str:map1.keySet()){
            System.out.println(map1.get(str));
        }

        for (String str:map2.keySet()){
            System.out.println(map2.get(str));
        }
        for (String str:map1.keySet()){
            map1.put(str,map2.get(str));
            System.out.println(map1.get(str));
        }
    }
}
