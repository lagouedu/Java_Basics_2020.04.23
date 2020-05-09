package com.lagou.task15;

import java.util.LinkedList;
import java.util.List;

public class ListGenericTest {

    public static void main(String[] args) {

        // 1.准备一个支持泛型机制的List集合，明确要求集合中的元素是String类型
        List<String> lt1 = new LinkedList<String>();
        // 2.向集合中添加元素并打印
        lt1.add("one");
        System.out.println("lt1 = " + lt1); // [one]
        //lt1.add(2);  Error
        // 3.获取集合中的元素并打印
        String s = lt1.get(0);
        System.out.println("获取到的元素是：" + s); // one

        System.out.println("----------------------------------------------------");
        // 2.准备一个支持Integer类型的List集合
        List<Integer> lt2 = new LinkedList<Integer>();
        lt2.add(1);
        lt2.add(2);
        //lt2.add("3"); Error
        System.out.println("lt2 = " + lt2); // [1, 2]
        Integer integer = lt2.get(0);
        System.out.println("获取到的元素是：" + integer); // 1

        System.out.println("----------------------------------------------------");
        // Java7开始的新特性： 菱形特性   就是后面<>中的数据类型可以省略
        List<Double> lt3 = new LinkedList<>();
        // 笔试考点
        // 试图将lt1的数值赋值给lt3，也就是覆盖lt3中原来的数值，结果编译报错：集合中支持的类型不同
        //lt3 = lt1; Error
    }
}
