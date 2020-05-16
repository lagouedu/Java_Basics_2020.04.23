package com.lagou.task18;

/**
 * 编程实现仓库类
 */
public class StoreHouse {
    private int cnt = 0; // 用于记录产品的数量

    public synchronized void produceProduct() {
        notify();
        if (cnt < 10) {
            System.out.println("线程" + Thread.currentThread().getName() + "正在生产第" + (cnt+1) + "个产品...");
            cnt++;
        } else {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public synchronized void consumerProduct() {
        notify();
        if (cnt > 0) {
            System.out.println("线程" + Thread.currentThread().getName() + "消费第" + cnt + "个产品");
            cnt--;
        } else {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
