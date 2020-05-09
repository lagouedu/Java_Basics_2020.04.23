package com.lagou.task12;

public class StringPoolTest {

    public static void main(String[] args) {

        // 1.验证一下常量池的存在
        // 到目前为止，只有String这个特殊类除了new的方式外还可以直接字符串赋值（包装类除外）
        String str1 = "abc";
        String str2 = "abc";
        System.out.println(str1 == str2); // 比较地址  true

    }
}
