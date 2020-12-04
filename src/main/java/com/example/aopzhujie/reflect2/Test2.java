package com.example.aopzhujie.reflect2;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**得到字节码文件对象中的构造器对象
 * @Description TODO
 * @Date 2020/11/5 16:42
 * @Created by ren
 */
public class Test2 {

    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InvocationTargetException, InstantiationException, NoSuchMethodException {

        Class<?> clazz = Class.forName("com.example.aopzhujie.reflect2.Person");

        //getConstructors()只能得到public修饰的构造器
        Constructor<?>[] constructors = clazz.getConstructors();
        System.out.println(constructors.length);
        //getDeclaredConstructors()得到所有的构造器
        Constructor<?>[] declaredConstructors = clazz.getDeclaredConstructors();
        System.out.println(declaredConstructors.length);
        //getConstructor()得到指定的构造器(只能是public 修饰的)
        Constructor<?> Constructor = clazz.getConstructor(String.class, int.class);
        Constructor.setAccessible(true);
        System.out.println(Constructor);
        //创建对象
        Object o = Constructor.newInstance("2", 2);
        Person person = (Person) o;

        person.eat();

        //getDeclaredConstructor()得到指定的构造器
        Constructor<?> declaredConstructor = clazz.getDeclaredConstructor(String.class, int.class);
        declaredConstructor.setAccessible(true);
        System.out.println(declaredConstructor);
        //创建对象
        Object obj = declaredConstructor.newInstance("2", 2);
        Person personObj = (Person) obj;

        personObj.eat();

    }
}
