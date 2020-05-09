package com.lagou.task11;

/**
 * 编程实现对Math类中常用方法的测试
 */
public class MathTest {

    public static void main(String[] args) {

        System.out.println("获取两个整数中最大值的结果是：" + Math.max(10, 20)); // 20
        System.out.println("获取两个整数中最小值的结果是：" + Math.min(10, 20)); // 10
        System.out.println("获取次方的结果是：" + Math.pow(2, 3)); // 8.0  体现double类型
        System.out.println("获取绝对值的结果是：" + Math.abs(-5)); // 5
        System.out.println("进行四舍五入的结果是：" + Math.round(3.14)); // 3
        System.out.println("该整数的平方根是：" + Math.sqrt(16)); // 4.0
        System.out.println("生成的随机数是：" + Math.random()); // 随机数
    }
}
