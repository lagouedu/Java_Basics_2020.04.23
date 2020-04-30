package com.lagou.task09;

public class SubAbstractTest extends AbstractTest/*, Account*/ {
    @Override
    public void show() {
        System.out.println("其实我是被迫重写的，否则我也得变成抽象的呀！");
    }

    public static void main(String[] args) {

        // 1.声明本类类型的引用指向本类类型的对象，没有多态
        SubAbstractTest sat = new SubAbstractTest();
        sat.show();

        System.out.println("-------------------------------");
        // 2.声明AbstractTest类型的引用指向子类的对象，形成了多态
        // 多态的使用场合之二： 直接在方法体中使用抽象类的引用指向子类类型的对象
        AbstractTest at = new SubAbstractTest2();
        // 编译阶段调用父类版本，运行阶段调用子类版本
        at.show();
        ((SubAbstractTest2) at).test();

        System.out.println("-------------------------------");
        SubAbstractTest2 sat2 = new SubAbstractTest2();
        sat2.test();
    }
}
