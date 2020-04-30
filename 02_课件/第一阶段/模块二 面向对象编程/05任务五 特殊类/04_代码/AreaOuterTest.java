package com.lagou.task10;

public class AreaOuterTest {

    public static void main(String[] args) {

        // 1.声明外部类类型的引用指向外部类的对象
        AreaOuter ao = new AreaOuter();
        // 2.通过show方法的调用实现局部内容类的定义和使用
        ao.show();
    }
}
