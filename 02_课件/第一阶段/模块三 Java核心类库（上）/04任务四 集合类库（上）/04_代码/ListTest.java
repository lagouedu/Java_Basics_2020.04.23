package com.lagou.task14;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListTest {

    public static void main(String[] args) {

        // 1.声明一个List接口类型的引用指向ArrayList类型的对象，形成了多态
        // 由源码可知：当new对象时并没有申请数组的内存空间
        List lt1 = new ArrayList();
        // 2.向集合中添加元素并打印
        // 由源码可知：当调用add方法添加元素时会给数组申请长度为10的一维数组，扩容原理是：原始长度的1.5倍
        lt1.add("one");
        System.out.println("lt1 = " + lt1); // [one]

        System.out.println("----------------------------------------------------");
        // 2.声明一个List接口类型的引用指向LinkedList类型的对象，形成了多态
        List lt2 = new LinkedList();
        lt2.add("one");
        System.out.println("lt2 = " + lt2); // [one]
    }
}
