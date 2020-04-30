package com.lagou.task10;

/**
 * 编程实现所有方向的枚举，所有的方向：向上、向下、向左、向右
 */
public class Direction {
    private final String desc; // 用于描述方向字符串的成员变量

    // 2.声明本类类型的引用指向本类类型的对象
    public static final Direction UP = new Direction("向上");
    public static final Direction DOWN = new Direction("向下");
    public static final Direction LEFT = new Direction("向左");
    public static final Direction RIGHT = new Direction("向右");

    // 通过构造方法实现成员变量的初始化，更加灵活
    // 1.私有化构造方法，此时该构造方法只能在本类的内部使用
    private Direction(String desc) {
        this.desc = desc;
    }

    // 通过公有的get方法可以在本类的外部访问该类成员变量的数值
    public String getDesc() {
        return desc;
    }
}
