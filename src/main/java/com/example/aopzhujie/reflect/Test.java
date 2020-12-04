package com.example.aopzhujie.reflect;

/**
 * @Description TODO
 * @Date 2020/11/5 16:29
 * @Created by ren
 */
public class Test {
    //如何得到字节码文件对象
    public static void main(String[] args){

        Person person = new Person();
        //1、Object.getClass()
        //Class1就是person的字节码文件对象
        /*Class<? extends Person> class1 = person.getClass();
        Class<? extends Person> class2 = person.getClass();*/

        //2、类型.class
        //类型：引用类型、基本类型
        Class<Person> personClass = Person.class;

        //Class.forName("类名")
        try {
            Class<?> person1 = Class.forName("com.example.aopzhujie.reflect.Person");

            System.out.println(person1);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}
