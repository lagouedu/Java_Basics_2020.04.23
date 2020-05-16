package com.lagou.task18;

public class SubThreadRunTest {

    public static void main(String[] args) {

        // 1.声明Thread类型的引用指向子类类型的对象
        Thread t1 = new SubThreadRun();
        // 2.调用run方法测试，本质上就是相当于对普通成员方法的调用，因此执行流程就是run方法的代码执行完毕后才能继续向下执行
        //t1.run();
        // 用于启动线程，Java虚拟机会自动调用该线程类中的run方法
        // 相当于又启动了一个线程，加上执行main方法的线程是两个线程
        t1.start();

        // 打印1 ~ 20之间的所有整数
        for (int i = 1; i <= 20; i++) {
            System.out.println("-----------------main方法中：i = " + i); // 1 2 ... 20
        }
    }
}
