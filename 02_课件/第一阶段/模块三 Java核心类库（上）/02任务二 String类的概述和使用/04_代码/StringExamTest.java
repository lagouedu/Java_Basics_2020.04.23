package com.lagou.task12;

public class StringExamTest {

    public static void main(String[] args) {

        // 1.请问下面的代码会创建几个对象？分别存放在什么地方？
        //String str1 = "hello";  // 1个对象  存放在常量池中
        //String str1 = new String("helo"); // 2个对象  1个在常量池中，1个在堆区

        // 2.常量池和堆区对象的比较
        String str1 = "hello";  // 常量池
        String str2 = "hello";  // 常量池
        String str3 = new String("hello"); // 堆区
        String str4 = new String("hello"); // 堆区

        System.out.println(str1 == str2);       // 比较地址  true
        System.out.println(str1.equals(str2));  // 比较内容  true
        System.out.println(str3 == str4);       // 比较地址  false
        System.out.println(str3.equals(str4));  // 比较内容  true
        System.out.println(str2 == str4);       // 比较地址  false
        System.out.println(str2.equals(str4));  // 比较内容 true

        System.out.println("------------------------------------------------------------");
        // 3.常量有优化机制，变量没有
        String str5 = "abcd";
        String str6 = "ab" + "cd";  // 常量优化机制  "abcd"
        System.out.println(str5 == str6); // 比较地址  true

        String str7 = "ab";
        String str8 = str7 + "cd"; // 没有常量优化
        System.out.println(str5 == str7); // 比较地址 false


    }
}
