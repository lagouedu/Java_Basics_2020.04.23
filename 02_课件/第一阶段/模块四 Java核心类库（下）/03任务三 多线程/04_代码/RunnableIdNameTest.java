package com.lagou.task18;

public class RunnableIdNameTest implements Runnable {
    @Override
    public void run() {
        // 获取当前正在执行线程的引用，也就是子线程的引用
        Thread t1 = Thread.currentThread();
        System.out.println("子线程的编号是：" + t1.getId() + "， 名称是：" + t1.getName()); // 14 guanyu
        t1.setName("zhangfei");
        System.out.println("修改后子线程的编号是：" + t1.getId() + "， 名称是：" + t1.getName()); // 14 zhangfei
    }

    public static void main(String[] args) {

        RunnableIdNameTest rint = new RunnableIdNameTest();
        //Thread t2 = new Thread(rint);
        Thread t2 = new Thread(rint, "guanyu");
        t2.start();

        // 获取当前正在执行线程的引用，当前正在执行的线程是主线程，也就是获取主线程的引用
        Thread t1 = Thread.currentThread();
        System.out.println("主线程的编号是：" + t1.getId() + ", 名称是：" + t1.getName());
    }
}
