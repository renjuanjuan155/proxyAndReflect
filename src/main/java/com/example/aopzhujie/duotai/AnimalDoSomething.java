package com.example.aopzhujie.duotai;

/**
 * @Description
 * @Date 2021/1/13 16:24
 * @Created by meijunjie
 */
//多态是指运行时的多态,而在java编码上其实就是父类子类或者接口与实现类的关系
public class AnimalDoSomething {
    public void animalDoSomething(Animal animal){
        animal.dosomething();
    }
    public void animalRun(Animal animal){
        animal.run();
    }


}
