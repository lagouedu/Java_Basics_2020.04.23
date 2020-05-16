package com.lagou.task18;

public class SubThread1 extends Thread {
    @Override
    public void run() {
        // 打印1 ~ 100之间的所有奇数
        for (int i = 1; i <= 100; i += 2) {
            System.out.println("子线程一中： i = " + i);
        }
    }
}
