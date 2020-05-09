package com.lagou.task15;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class HashSetTest {

    public static void main(String[] args) {

        // 1.声明一个Set类型的引用指向HashSet类型的对象
        Set<String> s1 = new HashSet<>();
        //Set<String> s1 = new LinkedHashSet<>();  // 将放入的元素使用双链表连接起来
        System.out.println("s1 = " + s1); // [啥也没有]

        System.out.println("----------------------------------------------------");
        // 2.向集合中添加元素并打印
        boolean b1 = s1.add("two");
        System.out.println("b1 = " + b1); // true
        System.out.println("s1 = " + s1); // [two]
        // 从打印结果上可以看到元素没有先后放入次序(表面)
        b1 = s1.add("one");
        System.out.println("b1 = " + b1); // true
        System.out.println("s1 = " + s1); // [one, two]   [two, one]

        b1 = s1.add("three");
        System.out.println("b1 = " + b1); // true
        System.out.println("s1 = " + s1); // [one, two, three]  [two, one, three]
        // 验证元素不能重复
        b1 = s1.add("one");
        System.out.println("b1 = " + b1); // false
        System.out.println("s1 = " + s1); // [one, two, three] [two, one, three]
    }
}
