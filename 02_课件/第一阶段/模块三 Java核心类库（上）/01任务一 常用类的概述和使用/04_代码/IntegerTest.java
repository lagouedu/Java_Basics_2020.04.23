package com.lagou.task11;

public class IntegerTest {

    public static void main(String[] args) {

        // 1.打印Integer类中常用的常量数值
        System.out.println("最大值是：" + Integer.MAX_VALUE); // 2^31-1
        System.out.println("最小值是：" + Integer.MIN_VALUE); // -2^31
        System.out.println("所表示二进制的位数是：" + Integer.SIZE); // 32
        System.out.println("所占字节的个数是：" + Integer.BYTES); // 4
        System.out.println("对应int类型的Class实例是：" + Integer.TYPE); // int

        System.out.println("------------------------------------------------------");
        // 2.使用构造方法来构造Integer类型的对象并打印
        //Integer it1 = new Integer(123);
        //System.out.println("it1 = " + it1); // 自动调用toString方法   123
        //Integer it2 = new Integer("456");
        //System.out.println("it2 = " + it2); // 456
        // 上述方法已过时，建议使用valueOf方法取代之，相当于从int类型到Integer类型的转换，叫做装箱
        Integer it3 = Integer.valueOf(123);
        System.out.println("it3 = " + it3); // 123
        // 相当于从String类型到Integer类型的转换
        Integer it4 = Integer.valueOf("456");
        System.out.println("it4 = " + it4); // 456   自动调用toString方法得到的是String类型
        // 获取调用对象中的整数数值，相当于从Integer类型到int类型的转换，叫做拆箱
        int ia = it4.intValue();
        System.out.println("获取到的整数数据是：" + ia); // 456  得到的是int类型

        System.out.println("------------------------------------------------------");
        // 3.从Java5开始增加了自动装箱和自动拆箱的机制
        Integer it5 = 100;  // 直接通过赋值运算符实现自动装箱
        int ib = it5;       // 直接通过赋值运算符实现自动拆箱

        System.out.println("------------------------------------------------------");
        // 4.装箱和拆箱的笔试考点
        Integer it6 = 127; //128;
        Integer it7 = 127; //128;
        Integer it8 = new Integer(127); //new Integer(128);
        Integer it9 = new Integer(127); //new Integer(128);
        System.out.println(it6 == it7);      // 比较地址  false  true  地址一样
        System.out.println(it6.equals(it7)); // 比较内容  true
        System.out.println(it8 == it9);      // 比较地址  false
        System.out.println(it8.equals(it9)); // 比较内容  true

        System.out.println("------------------------------------------------------");
        // 5.实现静态方法的调用
        int ic = Integer.parseInt("200");
        //int ic = Integer.parseInt("200a"); // 编译ok,运行发生NumberFormatException数字格式异常，因为有字母
        System.out.println("字符串转换为整数的结果是：" + ic); // 200
        System.out.println("根据参数指定的整数获取对应的十进制字符串是：" + Integer.toString(200));
        System.out.println("根据参数指定的整数获取对应的二进制字符串是：" + Integer.toBinaryString(200));
        System.out.println("根据参数指定的整数获取对应的十六进制字符串是：" + Integer.toHexString(200));
        System.out.println("根据参数指定的整数获取对应的八进制字符串是：" + Integer.toOctalString(200));
    }
}
