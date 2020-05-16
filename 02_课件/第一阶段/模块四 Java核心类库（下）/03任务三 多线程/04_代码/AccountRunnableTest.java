package com.lagou.task18;

import java.util.concurrent.locks.ReentrantLock;

public class AccountRunnableTest implements Runnable {
    private int balance; // 用于描述账户的余额
    private Demo dm = new Demo();
    private ReentrantLock lock = new ReentrantLock();  // 准备了一把锁

    public AccountRunnableTest() {
    }

    public AccountRunnableTest(int balance) {
        this.balance = balance;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    @Override
    public /*synchronized*/ void run() {
        // 开始加锁
        lock.lock();

        // 由源码可知：最终是account对象来调用run方法，因此当前正在调用的对象就是account，也就是说this就是account
        //synchronized (this) { // ok
        System.out.println("线程" + Thread.currentThread().getName() + "已启动...");
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
        //}
        lock.unlock(); // 实现解锁
    }

    public static void main(String[] args) {

        AccountRunnableTest account = new AccountRunnableTest(1000);
        //AccountRunnableTest account2 = new AccountRunnableTest(1000);
        Thread t1 = new Thread(account);
        Thread t2 = new Thread(account);
        //Thread t2 = new Thread(account2);
        t1.start();
        t2.start();

        System.out.println("主线程开始等待...");
        try {
            t1.join();
            //t2.start(); // 也就是等待线程一取款操作结束后再启动线程二
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("最终的账户余额为：" + account.getBalance()); // 600  800
    }
}

class Demo{}
