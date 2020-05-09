package com.lagou.task11;

public class BooleanTest {

    public static void main(String[] args) {

        // 1.在Java5之前采用方法进行装箱和拆箱
        // 相当于从boolean类型到Boolean类型的转换，装箱
        Boolean bo1 = Boolean.valueOf(true);
        System.out.println("bo1 = " + bo1); // true
        boolean b1 = bo1.booleanValue();
        System.out.println("b1 = " + b1); // true

        System.out.println("----------------------------------------------");
        // 2.从Java5开始支持自动装箱和拆箱
        Boolean bo2 = false;
        boolean b2 = bo2;
        System.out.println("b2 = " + b2); // false

        System.out.println("----------------------------------------------");
        // 3.实现从String类型到boolean类型的转换
        //boolean b3 = Boolean.parseBoolean("112");
        // 该方法的执行原理是：只要参数数值不为true或者TRUE时，则结果就是false，查手册和源码
        boolean b3 = Boolean.parseBoolean("TRUE");
        System.out.println("b3 = " + b3); // true
    }
}
