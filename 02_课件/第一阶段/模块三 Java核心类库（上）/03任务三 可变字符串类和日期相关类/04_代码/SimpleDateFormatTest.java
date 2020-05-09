package com.lagou.task13;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatTest {

    public static void main(String[] args) throws Exception {

        // 1.获取当前系统时间并打印
        Date d1 = new Date();
        System.out.println("d1 = " + d1);

        // 2.构造SimpleDateFormat类型的对象并指定格式
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        // 3.实现日期类型向文本类型的转换并打印
        // alt+Enter 可以实现返回值的生成
        String format = sdf.format(d1);
        System.out.println("转换后的日期为：" + format);
        // 4.实现文本类型到日期类型的转换并打印
        Date parse = sdf.parse(format);
        System.out.println("转回日期格式的结果为：" + parse);
    }
}
