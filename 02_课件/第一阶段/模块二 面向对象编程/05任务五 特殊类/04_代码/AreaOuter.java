package com.lagou.task10;

/**
 * 编程实现局部内部类的定义和使用
 */
public class AreaOuter {
    private int cnt = 1;

    public void show() {

        // 定义一个局部变量进行测试，从Java8开始默认理解为final关键字修饰的变量
        // 虽然可以省略final关键字，但建议还是加上
        final int ic = 4;

        // 定义局部内部类，只在当前方法体的内部好使    拷贝一份
        class AreaInner {
            private int ia = 2;

            public AreaInner() {
                System.out.println("局部内部类的构造方法！");
            }

            public void test() {
                int ib = 3;
                System.out.println("ia = " + ia); // 2
                System.out.println("cnt = " + cnt); // 1
                //ic = 5;  Error
                System.out.println("ic = " + ic); // 4
            }
        }

        // 声明局部内部类的引用指向局部内部类的对象
        AreaInner ai = new AreaInner();
        ai.test();
    }

}
