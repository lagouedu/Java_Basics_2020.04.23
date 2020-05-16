package com.lagou.task18;

public class ThreadCommunicateTest implements Runnable {
    private int cnt = 1;

    @Override
    public void run() {
        while (true) {
            synchronized (this) {
                // 每当有一个线程进来后先大喊一声，调用notify方法
                notify();
                if (cnt <= 100) {
                    System.out.println("线程" + Thread.currentThread().getName() + "中：cnt = " + cnt);
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    cnt++;
                    // 当前线程打印完毕一个整数后，为了防止继续打印下一个数据，则调用wait方法
                    try {
                        wait(); // 当前线程进入阻塞状态，自动释放对象锁，必须在锁定的代码中调用
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                } else {
                    break;
                }
            }
        }
    }

    public static void main(String[] args) {

        ThreadCommunicateTest tct = new ThreadCommunicateTest();
        Thread t1 = new Thread(tct);
        t1.start();

        Thread t2 = new Thread(tct);
        t2.start();
    }
}
