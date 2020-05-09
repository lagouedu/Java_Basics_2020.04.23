package com.lagou.task12;

import java.util.Scanner;

public class SubStringTest {

    public static void main(String[] args) {

        // 1.构造String类型的对象并打印
        String str1 = new String("Happy Wife, Happy Life!");
        System.out.println("str1 = " + str1); // Happy Wife, Happy Life!

        // 2.获取字符串中的一部分内容并打印
        // 表示从当前字符串中下标12开始获取子字符串
        String str2 = str1.substring(12);
        System.out.println("str2 = " + str2); // Happy Life!
        // 可以取到6但是取不到10
        String str3 = str1.substring(6, 10);
        System.out.println("str3 = " + str3); // Wife

        System.out.println("---------------------------------------------------------");
        // 3.获取输入字符串中从输入字符起的子字符串内容
        System.out.println("请输入一个字符串：");
        Scanner sc = new Scanner(System.in);
        String str4 = sc.next();
        System.out.println("请输入一个字符：");
        String str5 = sc.next();
        // 从str4中查找str5第一次出现的索引位置
        int pos = str4.indexOf(str5);
        System.out.println("pos = " + pos);
        // 根据该位置获取子字符串
        String str6 = str4.substring(pos+1);
        System.out.println("获取到的子字符串是：" + str6);
    }
}
