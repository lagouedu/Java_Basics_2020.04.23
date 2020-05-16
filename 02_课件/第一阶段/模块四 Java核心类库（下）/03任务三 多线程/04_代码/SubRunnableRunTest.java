package com.lagou.task18;

public class SubRunnableRunTest {

    public static void main(String[] args) {

        // 1.创建自定义类型的对象，也就是实现Runnable接口类的对象
        SubRunnableRun srr = new SubRunnableRun();
        // 2.使用该对象作为实参构造Thread类型的对象
        // 由源码可知：经过构造方法的调用之后，Thread类中的成员变量target的数值为srr。
        Thread t1 = new Thread(srr);
        // 3.使用Thread类型的对象调用start方法
        // 若使用Runnable引用构造了线程对象，调用该方法(run)时最终调用接口中的版本
        // 由run方法的源码可知：if (target != null) {
        //                         target.run();
        //                    }
        // 此时target的数值不为空这个条件成立，执行target.run()的代码，也就是srr.run()的代码
        t1.start();
        //srr.start();  Error

        // 打印1 ~ 20之间的所有整数
        for (int i = 1; i <= 20; i++) {
            System.out.println("-----------------main方法中：i = " + i); // 1 2 ... 20
        }
    }
}
