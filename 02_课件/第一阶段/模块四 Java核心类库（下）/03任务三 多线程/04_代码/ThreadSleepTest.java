package com.lagou.task18;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Date;

public class ThreadSleepTest extends Thread {
    // 声明一个布尔类型的变量作为循环是否执行的条件
    private boolean flag = true;

    // 子类中重写的方法不能抛出更大的异常
    @Override
    public void run() {
        // 每隔一秒获取一次系统时间并打印，模拟时钟的效果
        while (flag) {
            // 获取当前系统时间并调整格式打印
//            LocalDateTime.now();
            Date d1 = new Date();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            System.out.println(sdf.format(d1));

            // 睡眠1秒钟
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {

        ThreadSleepTest tst = new ThreadSleepTest();
        tst.start();

        // 主线程等待5秒后结束子线程
        System.out.println("主线程开始等待...");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        // 停止子线程  过时  不建议使用
        //tst.stop();
        tst.flag = false;
        System.out.println("主线程等待结束！");
    }
}
