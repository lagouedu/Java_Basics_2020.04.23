package com.lagou.task14;

import java.util.LinkedList;
import java.util.Queue;

public class QueueTest {

    public static void main(String[] args) {

        // 1.准备一个Queue集合并打印
        Queue queue = new LinkedList();
        System.out.println("队列中的元素有：" + queue); // [啥也没有]

        System.out.println("----------------------------------------------------------");
        // 2.将数据11、22、33、44、55依次入队并打印
        for (int i = 1; i <= 5; i++) {
            boolean b1 = queue.offer(i * 11);
            //System.out.println("b1 = " + b1);
            System.out.println("队列中的元素有：" + queue); // 11 22 33 44 55
        }

        System.out.println("----------------------------------------------------------");
        // 3.然后查看队首元素并打印
        System.out.println("对首元素是：" + queue.peek()); // 11

        System.out.println("----------------------------------------------------------");
        // 4.然后将队列中所有数据依次出队并打印
        int len = queue.size();
        for (int i = 1; i <= len; i++) {
            System.out.println("出队的元素是：" + queue.poll()); // 11 22 33 44 55
        }

        System.out.println("----------------------------------------------------------");
        // 5.查看队列中最终的元素
        System.out.println("队列中的元素有：" + queue); // [啥也没有]
    }
}
