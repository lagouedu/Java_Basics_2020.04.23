package com.lagou.task13;

import java.time.Instant;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;

public class InstantTest {

    public static void main(String[] args) {

        // 1.使用Instant类来获取当前系统时间  并不是当前系统的默认时区  本初子午线   差8小时  东八区
        Instant now = Instant.now();
        System.out.println("获取到的当前时间为：" + now);

        // 2.加上时区所差的8个小时
        OffsetDateTime offsetDateTime = now.atOffset(ZoneOffset.ofHours(8));
        System.out.println("偏移后的日期时间为：" + offsetDateTime);

        System.out.println("--------------------------------------------------------");
        // 3.获取当前调用对象距离标准基准时间的毫秒数
        long g1 = now.toEpochMilli();
        System.out.println("获取到的毫秒差为：" + g1);

        // 4.根据参数指定的毫秒数来构造对象
        Instant instant = Instant.ofEpochMilli(g1);
        System.out.println("根据参数指定的毫秒数构造出来的对象为：" + instant);
    }
}
