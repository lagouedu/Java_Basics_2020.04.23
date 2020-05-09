package com.lagou.task13;

import java.util.Date;

public class DateTest {

    public static void main(String[] args) {

        // 1.使用无参方式构造Date对象并打印
        Date d1 = new Date();
        System.out.println("d1 = " + d1); // 获取当前系统时间

        System.out.println("------------------------------------");
        // 2.使用参数指定的毫秒数来构造Date对象并打印  1秒 = 1000毫秒  东八区
        Date d2 = new Date(1000);
        System.out.println("d2 = " + d2); // 1970 1 1 8 0 1

        System.out.println("------------------------------------");
        // 3.获取调用对象距离1970年1月1日0时0分0秒的毫秒数
        long msec = d2.getTime();
        System.out.println("获取到的毫秒数是：" + msec); // 1000

        // 4.设置调用对象所表示的时间点为参数指定的毫秒数
        d2.setTime(2000);
        System.out.println("修改后的时间是：" + d2); // 1970 1 1 8 0 2
    }
}
