package com.lagou.task11;

public class CharacterTest {

    public static void main(String[] args) {

        // 1.在Java5之前调用方法实现装箱和拆箱机制
        // 相当于从char类型到Character类型的转换，装箱
        Character ca1 = Character.valueOf('a');
        System.out.println("ca1 = " + ca1); // a
        // 从Character类型向char类型的转换，拆箱
        char c1 = ca1.charValue();
        System.out.println("c1 = " + c1); // a

        System.out.println("----------------------------------------");
        // 2.从Java5开始支持自动装箱和拆箱
        Character ca2 = 'b';
        char c2 = ca2;
        System.out.println("c2 = " + c2); // b

        System.out.println("----------------------------------------");
        // 3.实现字符类型的判断以及转换
        System.out.println(Character.isUpperCase(c2)); // 判断是否为大写字母  false
        System.out.println(Character.isLowerCase(c2)); // 判断是否为小写字母  true
        System.out.println(Character.isDigit(c2));     // 判断是否为数字字符  false
        System.out.println("转换为大写字符是：" + Character.toUpperCase(c2)); // B
        System.out.println("转换为小写字符是：" + Character.toLowerCase(c2)); // b
    }
}
