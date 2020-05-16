package com.lagou.task18;

public class SubThreadTest {

    public static void main(String[] args) {

        SubThread1 st1 = new SubThread1();
        SubThread2 st2 = new SubThread2();

        st1.start();
        st2.start();

        System.out.println("主线程开始等待...");
        try {
            st1.join();
            st2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("主线程等待结束！");
    }
}
