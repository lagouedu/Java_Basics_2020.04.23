package com.lagou.task10;

/**
 * 实现静态内部类的定义和使用
 */
public class StaticOuter {
    private int cnt = 1;        // 隶属于对象层级
    private static int snt = 2; // 隶属于类层级

    public /*static*/ void show() {
        System.out.println("外部类的show方法就是这里！");
    }

    /**
     * 定义静态内部类   有static关键字修饰隶属于类层级
     */
    public static class StaticInner {
        private int ia = 3;
        private static int snt = 4;

        public StaticInner() {
            System.out.println("静态内部类的构造方法哦！");
        }

        public void show() {
            System.out.println("ia = " + ia); // 3
            System.out.println("外部类中的snt = " + snt); // 2
            //System.out.println("外部类的cnt = " + cnt); // Error:静态上下文中不能访问非静态的成员，因此此时可能还没有创建对象
        }

        public void show2(int snt) {  // 就近原则
            System.out.println("snt = " + snt); // 5
            System.out.println("内部类中的成员snt = " + StaticInner.snt); // 4
            System.out.println("外部类中的成员snt = " + StaticOuter.snt); // 2
            //StaticOuter.show();
            new StaticOuter().show();
        }
    }
}
