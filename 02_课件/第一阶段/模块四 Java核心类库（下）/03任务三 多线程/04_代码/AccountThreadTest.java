package com.lagou.task18;

public class AccountThreadTest extends Thread {
    private int balance; // 用于描述账户的余额
    private static Demo dm = new Demo(); // 隶属于类层级，所有对象共享同一个

    public AccountThreadTest() {
    }

    public AccountThreadTest(int balance) {
        this.balance = balance;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    @Override
    public /*static*/ /*synchronized*/ void run() {
        /*System.out.println("线程" + Thread.currentThread().getName() + "已启动...");
        //synchronized (dm) { // ok
            //synchronized (new Demo()) { // 锁不住  要求必须是同一个对象
            // 1.模拟从后台查询账户余额的过程
            int temp = getBalance(); // temp = 1000  temp = 1000
            // 2.模拟取款200元的过程
            if (temp >= 200) {
                System.out.println("正在出钞，请稍后...");
                temp -= 200;  // temp = 800   temp = 800
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("请取走您的钞票！");
            } else {
                System.out.println("余额不足，请核对您的账户余额！");
            }
            // 3.模拟将最新的账户余额写入到后台
            setBalance(temp); // balance = 800  balance = 800
        //}*/
        test();
    }

    public /*synchronized*/ static void test() {
        synchronized (AccountThreadTest.class) { // 该类型对应的Class对象，由于类型是固定的，因此Class对象也是唯一的，因此可以实现同步
            System.out.println("线程" + Thread.currentThread().getName() + "已启动...");
            //synchronized (dm) { // ok
            //synchronized (new Demo()) { // 锁不住  要求必须是同一个对象
            // 1.模拟从后台查询账户余额的过程
            int temp = 1000; //getBalance(); // temp = 1000  temp = 1000
            // 2.模拟取款200元的过程
            if (temp >= 200) {
                System.out.println("正在出钞，请稍后...");
                temp -= 200;  // temp = 800   temp = 800
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("请取走您的钞票！");
            } else {
                System.out.println("余额不足，请核对您的账户余额！");
            }
            // 3.模拟将最新的账户余额写入到后台
            //setBalance(temp); // balance = 800  balance = 800
        }
    }

    public static void main(String[] args) {

        AccountThreadTest att1 = new AccountThreadTest(1000);
        att1.start();

        AccountThreadTest att2 = new AccountThreadTest(1000);
        att2.start();

        System.out.println("主线程开始等待...");
        try {
            att1.join();
            //t2.start(); // 也就是等待线程一取款操作结束后再启动线程二
            att2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("最终的账户余额为：" + att1.getBalance()); // 800

    }

    }
