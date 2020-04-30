package com.lagou.task10;

/**
 * 编程实现所有方向的枚举，所有的方向：向上、向下、向左、向右   枚举类型要求所有枚举值必须放在枚举类型的最前面
 */
public enum DirectionEnum implements DirectionInterface {
    // 2.声明本类类型的引用指向本类类型的对象
    // 匿名内部类的语法格式：接口/父类类型 引用变量名 = new 接口/父类类型() { 方法的重写 };
    // public static final Direction UP = new Direction("向上") { 方法的重写 };
    UP("向上") {
        @Override
        public void show() {
            System.out.println("贪吃蛇向上移动了一下！");
        }
    }, DOWN("向下") {
        @Override
        public void show() {
            System.out.println("贪吃蛇向下移动了一下！");
        }
    }, LEFT("向左") {
        @Override
        public void show() {
            System.out.println("左移了一下！");
        }
    }, RIGHT("向右") {
        @Override
        public void show() {
            System.out.println("右移了一下！");
        }
    };

    private final String desc; // 用于描述方向字符串的成员变量

    // 通过构造方法实现成员变量的初始化，更加灵活
    // 1.私有化构造方法，此时该构造方法只能在本类的内部使用
    private DirectionEnum(String desc) { this.desc = desc; }

    // 通过公有的get方法可以在本类的外部访问该类成员变量的数值
    public String getDesc() {
        return desc;
    }

    // 整个枚举类型只重写一次，所有对象调用同一个
    /*@Override
    public void show() {
        System.out.println("现在可以实现接口中抽象方法的重写了！");
    }*/
}
