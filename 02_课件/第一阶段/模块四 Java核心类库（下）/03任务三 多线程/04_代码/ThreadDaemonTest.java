package com.lagou.task18;

public class ThreadDaemonTest extends Thread {
    @Override
    public void run() {
        //System.out.println(isDaemon()? "该线程是守护线程": "该线程不是守护线程"); // 默认不是守护线程
        // 当子线程不是守护线程时，虽然主线程先结束了，但是子线程依然会继续执行，直到打印完毕所有数据为止
        // 当子线程是守护线程时，当主线程结束后，则子线程随之结束
        for (int i = 0; i < 50; i++) {
            System.out.println("子线程中：i = " + i);
        }
    }

    public static void main(String[] args) {

        ThreadDaemonTest tdt = new ThreadDaemonTest();
        // 必须在线程启动之前设置子线程为守护线程
        tdt.setDaemon(true);
        tdt.start();

        for (int i = 0; i < 20; i++) {
            System.out.println("-------主线程中：i = " + i);
        }
    }
}
