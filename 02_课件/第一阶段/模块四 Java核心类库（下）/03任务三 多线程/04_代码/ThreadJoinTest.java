package com.lagou.task18;

public class ThreadJoinTest extends Thread {
    @Override
    public void run() {
        // 模拟倒数10个数的效果
        System.out.println("倒计时开始...");
        for (int i = 10; i > 0; i--) {
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("新年快乐！");
    }

    public static void main(String[] args) {

        ThreadJoinTest tjt = new ThreadJoinTest();
        tjt.start();

        // 主线程开始等待
        System.out.println("主线程开始等待...");
        try {
            // 表示当前正在执行的线程对象等待调用线程对象，也就是主线程等待子线程终止
            //tjt.join();
            tjt.join(5000); // 最多等待5秒
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //System.out.println("终于等到你，还好没放弃！");
        System.out.println("可惜不是你，陪我到最后！");
    }
}
