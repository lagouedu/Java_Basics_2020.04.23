package com.lagou.task13;

public class SystemTest {

    public static void main(String[] args) {

        // 1.获取当前系统时间距离1970年1月1日0时0分0秒的毫秒数
        long msec = System.currentTimeMillis();
        System.out.println("当前系统时间距离1970年1月1日0时0分0秒已经过去" + msec + "毫秒了！");

        // 通常用于测试某一段代码的执行效率
    }
}
