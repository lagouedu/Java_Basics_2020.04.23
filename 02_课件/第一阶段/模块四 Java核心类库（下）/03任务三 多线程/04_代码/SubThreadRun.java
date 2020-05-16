package com.lagou.task18;

public class SubThreadRun extends Thread {

    @Override
    public void run() {
        // 打印1 ~ 20之间的所有整数
        for (int i = 1; i <= 20; i++) {
            System.out.println("run方法中：i = " + i); // 1 2 ... 20
        }
    }
}
