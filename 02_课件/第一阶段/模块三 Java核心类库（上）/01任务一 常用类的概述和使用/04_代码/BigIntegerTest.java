package com.lagou.task11;

import java.math.BigInteger;

public class BigIntegerTest {

    public static void main(String[] args) {

        // 1.构造两个BigInteger类型的对象并指定初始值
        BigInteger bi1 = new BigInteger("20");
        BigInteger bi2 = new BigInteger("8");
        // 2.实现加减乘除取余操作并打印
        System.out.println("实现加法运算的结果是：" + bi1.add(bi2)); // 28
        System.out.println("实现减法运算的结果是：" + bi1.subtract(bi2)); // 12
        System.out.println("实现乘法运算的结果是：" + bi1.multiply(bi2)); // 160
        System.out.println("实现除法运算的结果是：" + bi1.divide(bi2)); // 2
        System.out.println("实现取余运算的结果是：" + bi1.remainder(bi2)); // 4

        System.out.println("-----------------------------------------------------");
        // 3.一次性得到商和余数
        BigInteger[] arr = bi1.divideAndRemainder(bi2);
        for (int i = 0; i < arr.length; i++) {
            System.out.println("下标为" + i + "的元素是：" + arr[i]); // 2 4
        }
    }
}
