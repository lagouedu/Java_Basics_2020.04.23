package com.lagou.task18;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class ThreadCallableTest implements Callable {

    @Override
    public Object call() throws Exception {
        // 计算1 ~ 10000之间的累加和并打印返回
        int sum = 0;
        for (int i = 1; i <= 10000; i++) {
            sum +=i;
        }
        System.out.println("计算的累加和是：" + sum); // 50005000
        return sum;
    }

    public static void main(String[] args) {

        ThreadCallableTest tct = new ThreadCallableTest();
        FutureTask ft = new FutureTask(tct);
        Thread t1 = new Thread(ft);
        t1.start();
        Object obj = null;
        try {
            obj = ft.get();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
        System.out.println("线程处理方法的返回值是：" + obj); // 50005000
    }
}
