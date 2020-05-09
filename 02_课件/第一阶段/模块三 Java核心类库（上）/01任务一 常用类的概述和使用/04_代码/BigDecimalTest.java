package com.lagou.task11;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class BigDecimalTest {

    public static void main(String[] args) {

        // 1.构造BigDecimal类型的两个对象
        BigDecimal bd1 = new BigDecimal("5.2");
        BigDecimal bd2 = new BigDecimal("1.3");
        // 2.使用构造完毕的对象实现加减乘除运算
        System.out.println("实现加法运算的结果是：" + bd1.add(bd2)); // 6.5
        System.out.println("实现减法运算的结果是：" + bd1.subtract(bd2)); // 3.9
        System.out.println("实现乘法运算的结果是：" + bd1.multiply(bd2)); // 6.76
        System.out.println("实现除法运算的结果是：" + bd1.divide(bd2)); // 4

        System.out.println("---------------------------------------------------------------");
        // 3.实现精确运算
        System.out.println(0.1 + 0.2); // 0.30000000000000004
        BigDecimal bd3 = new BigDecimal("0.1");
        BigDecimal bd4 = new BigDecimal("0.2");
        System.out.println("精确计算的结果是：" + bd3.add(bd4)); // 0.3

        System.out.println("---------------------------------------------------------------");
        // 4.注意事项
        BigDecimal bd5 = new BigDecimal("2");
        BigDecimal bd6 = new BigDecimal("0.3");
        System.out.println("除法运算的结果是：" + bd5.divide(bd6, RoundingMode.HALF_UP)); // 7
    }
}
