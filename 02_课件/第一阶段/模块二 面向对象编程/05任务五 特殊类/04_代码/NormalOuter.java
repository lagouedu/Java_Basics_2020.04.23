package com.lagou.task10;

/**
 * 编程实现普通内部类的定义和使用       -  文档注释
 */
public class NormalOuter {
    private int cnt = 1;

    // 定义普通内部类，隶属于外部类的成员，并且是对象层级
    /*private*/public /*final*/ class NormalInner {
        private int ia = 2;
        private int cnt = 3;
        public NormalInner() {
            System.out.println("普通内部类的构造方法体执行到了！");
        }

        public void show() {
            System.out.println("外部类中变量cnt的数值为：" + cnt); // 1
            System.out.println("ia = " + ia); // 2
        }

        public void show2(int cnt) {
            System.out.println("形参变量cnt = " + cnt);  // 局部优先原则  4
            System.out.println("内部类中cnt = " + this.cnt); // 3
            System.out.println("外部类中cnt = " + NormalOuter.this.cnt); // 1
        }
    }
}
