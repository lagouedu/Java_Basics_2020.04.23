package com.lagou.task10;

public class DirectionTest {

    public static void main(String[] args) {

        /*// 1.声明Direction类型的引用指向该类型的对象并打印特征
        Direction d1 = new Direction("向上");
        System.out.println("获取到的字符串是：" + d1.getDesc()); // 向上

        Direction d2 = new Direction("向下");
        System.out.println("获取到的字符串是：" + d2.getDesc()); // 向下

        Direction d3 = new Direction("向左");
        System.out.println("获取到的字符串是：" + d3.getDesc()); // 向左

        Direction d4 = new Direction("向右");
        System.out.println("获取到的字符串是：" + d4.getDesc()); // 向右

        System.out.println("-------------------------------------");
        Direction d5 = new Direction("向前");
        System.out.println("获取到的字符串是：" + d5.getDesc()); // 向前*/

        //Direction.UP = 2; Error:类型不匹配
        //Direction d2 = null;
        //Direction.UP = d2; Error: final关键字修饰
        Direction d1 = Direction.UP;
        System.out.println("获取到的方向是：" + d1.getDesc()); // 向上

        System.out.println("-------------------------------------");
        // 使用一下Java5开始的枚举类型
        DirectionEnum de = DirectionEnum.DOWN;
        System.out.println("获取到的方向是：" + de.getDesc()); // 向下
    }
}
