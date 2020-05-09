package com.lagou.task15;

import java.util.LinkedList;
import java.util.List;

public class GenericTest {

    public static void main(String[] args) {

        // 1.声明两个List类型的集合进行测试
        List<Animal> lt1 = new LinkedList<>();
        List<Dog> lt2 = new LinkedList<>();
        // 试图将lt2的数值赋值给lt1，也就是发生List<Dog>类型向List<Animal>类型的转换
        //lt1 = lt2;  Error: 类型之间不具备父子类关系

        System.out.println("---------------------------------------------");
        // 2.使用通配符作为泛型类型的公共父类
        List<?> lt3 = new LinkedList<>();
        lt3 = lt1; // 可以发生List<Animal>类型到List<?>类型的转换
        lt3 = lt2; // 可以发生List<Dog>类型到List<?>类型的转换

        // 向公共父类中添加元素和获取元素
        //lt3.add(new Animal()); Error: 不能存放Animal类型的对象
        //lt3.add(new Dog());    Error: 不能存放Dog类型的对象， 不支持元素的添加操作

        Object o = lt3.get(0);  // ok，支持元素的获取操作，全部当做Object类型来处理

        System.out.println("---------------------------------------------");
        // 3.使用有限制的通配符进行使用
        List<? extends Animal> lt4 = new LinkedList<>();
        // 不支持元素的添加操作
        //lt4.add(new Animal());
        //lt4.add(new Dog());
        //lt4.add(new Object());
        // 获取元素
        Animal animal = lt4.get(0);

        System.out.println("---------------------------------------------");
        List<? super Animal> lt5 = new LinkedList<>();
        lt5.add(new Animal());
        lt5.add(new Dog());
        //lt5.add(new Object());  Error: 超过了Animal类型的范围
        Object object = lt5.get(0);
    }
}
