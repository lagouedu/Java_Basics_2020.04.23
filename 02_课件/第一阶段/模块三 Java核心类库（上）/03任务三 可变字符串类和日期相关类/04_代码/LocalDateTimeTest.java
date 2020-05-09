package com.lagou.task13;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalDateTimeTest {

    public static void main(String[] args) {

        // 1.获取当前日期信息并打印
        LocalDate now = LocalDate.now();
        System.out.println("获取到的当前日期是：" + now);
        // 2.获取当前时间信息并打印
        LocalTime now1 = LocalTime.now();
        System.out.println("获取到的当前时间是：" + now1);
        // 3.获取当前日期时间信息并打印，使用最多
        LocalDateTime now2 = LocalDateTime.now();
        System.out.println("获取到的当前日期时间是：" + now2);

        System.out.println("-------------------------------------------------------");
        // 4.使用参数指定的年月日时分秒信息来获取对象并打印
        // 使用ctrl+F12来查找指定的方法
        LocalDateTime of = LocalDateTime.of(2008, 8, 8, 20, 8, 8);
        System.out.println("指定的日期时间是：" + of); // 自动调用toString方法
        System.out.println("获取到的年是：" + of.getYear()); // 2008
        System.out.println("获取到的月是：" + of.getMonthValue()); // 8
        System.out.println("获取到的日是：" + of.getDayOfMonth()); // 8
        System.out.println("获取到的时是：" + of.getHour()); // 20
        System.out.println("获取到的分是：" + of.getMinute()); // 8
        System.out.println("获取到的秒是：" + of.getSecond()); // 8

        System.out.println("-------------------------------------------------------");
        // 5.实现特征的设置并打印
        // 与String类型相似，调用对象本身的数据内容不会改变，返回值相当于创建了一个新的对象，由此证明了不可变性
        LocalDateTime localDateTime = of.withYear(2012);
        System.out.println("localDateTime = " + localDateTime); // 2012-08-08T20:08:08
        System.out.println("of = " + of); // 2008-08-08T20:08:08
        LocalDateTime localDateTime1 = localDateTime.withMonth(12);
        System.out.println("localDateTime1 = " + localDateTime1); // 2012 12 8 20 8 8

        System.out.println("-------------------------------------------------------");
        // 6.实现特征的增加并打印
        LocalDateTime localDateTime2 = localDateTime1.plusDays(2);
        System.out.println("localDateTime2 = " + localDateTime2); // 2012 12 10 20 8 8
        System.out.println("localDateTime1 = " + localDateTime1); // 2012 12 8 20 8 8
        LocalDateTime localDateTime3 = localDateTime2.plusHours(3);
        System.out.println("localDateTime3 = " + localDateTime3); // 2012 12 10 23 8 8

        System.out.println("-------------------------------------------------------");
        // 7.实现特征的减少并打印
        LocalDateTime localDateTime4 = localDateTime3.minusMinutes(1);
        System.out.println("localDateTime4 = " + localDateTime4); // 2012 12 10 23 7 8
        System.out.println("localDateTime3 = " + localDateTime3); // 2012 12 10 23 8 8
        LocalDateTime localDateTime5 = localDateTime4.minusSeconds(3);
        System.out.println("localDateTime5 = " + localDateTime5); // 2012 12 10 23 7 5

    }
}
