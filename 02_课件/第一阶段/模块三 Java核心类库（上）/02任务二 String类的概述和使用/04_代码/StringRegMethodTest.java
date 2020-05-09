package com.lagou.task12;

public class StringRegMethodTest {

    public static void main(String[] args) {

        // 1.准备一个字符串对象并打印
        String str1 = "1001,zhangfei,30";
        System.out.println("str1 = " + str1); // 1001,zhangfei,30
        // 2.按照逗号对字符串内容进行切割
        String[] sArr = str1.split(",");
        for (int i = 0; i < sArr.length; i++) {
            System.out.println("下标为" + i + "的字符串是：" + sArr[i]); // 1001 zhangfei 30
        }

        System.out.println("--------------------------------------------------------------");
        // 3.准备一个字符串内容并进行替换
        String str2 = "我的小名叫大帅哥";
        // 将字符串中所有的字符'我'替换为'你'
        String str3 = str2.replace('我', '你');
        System.out.println("str2 = " + str2); // 我的小名叫大帅哥
        System.out.println("str3 = " + str3); // 你的小名叫大帅哥
        // 将字符串中所有的字符'大'替换为'小'
        String str4 = str3.replace('大', '小');
        System.out.println("str4 = " + str4); // 你的小名叫小帅哥
        // 将字符串中所有的字符'小'替换为'大'
        String str5 = str4.replace('小', '大');
        System.out.println("str5 = " + str5); // 你的大名叫大帅哥

        System.out.println("--------------------------------------------------------------");
        // 4.准备一个字符串进行字符串内容的替换
        String str6 = "123abc456def789ghi";
        // 将第一个数字字符串替换为"#"
        String str7 = str6.replaceFirst("\\d+", "#");
        System.out.println("替换第一个字符串后的结果是：" + str7); // #abc456def789ghi
        // 将所有字母字符串替换为"$$$"
        String str8 = str7.replaceAll("[a-z]+", "A");
        System.out.println("str8 = " + str8); // #A456A789A

    }
}
