package com.lagou.task18;

public class SubThread2 extends Thread {
    @Override
    public void run() {
        // 打印1 ~ 100之间的所有偶数
        for (int i = 2; i <= 100; i += 2) {
            System.out.println("------子线程二中： i = " + i);
        }
    }
}
