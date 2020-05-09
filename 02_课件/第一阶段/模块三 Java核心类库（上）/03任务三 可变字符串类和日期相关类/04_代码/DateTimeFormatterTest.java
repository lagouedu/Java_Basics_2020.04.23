package com.lagou.task13;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAccessor;

public class DateTimeFormatterTest {

    public static void main(String[] args) {

        // 1.获取当前系统的日期时间并打印
        LocalDateTime now = LocalDateTime.now();
        System.out.println("now = " + now);

        // 2.按照指定的格式准备一个DateTimeFormatter类型的对象
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        // 3.实现日期时间向字符串类型的转换并打印
        String str = dateTimeFormatter.format(now);
        System.out.println("调整格式后的结果是：" + str);
        // 4.实现字符串类型到日期时间类型的转换并打印
        TemporalAccessor parse = dateTimeFormatter.parse(str);
        System.out.println("转回去的结果是：" + parse);
    }
}
