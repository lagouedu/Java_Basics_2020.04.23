package com.lagou.task15;

import com.lagou.task10.StaticOuter;

import java.util.*;

public class CollectionsTest {

    public static void main(String[] args) {

        // 1.准备一个集合并初始化
        List<Integer> lt1 = Arrays.asList(10, 30, 20, 50, 45);
        // 2.实现集合中元素的各种操作
        System.out.println("集合中的最大值是：" + Collections.max(lt1)); // 50
        System.out.println("集合中的最小值是：" + Collections.min(lt1)); // 10

        // 实现集合中元素的反转
        Collections.reverse(lt1);
        System.out.println("lt1 = " + lt1); // [45, 50, 20, 30, 10]
        // 实现两个元素的交换
        Collections.swap(lt1, 0, 4);
        System.out.println("交换后：lt1 = " + lt1); // [10, 50, 20, 30, 45]
        // 实现元素的排序
        Collections.sort(lt1);
        System.out.println("排序后：lt1 = " + lt1); // [10, 20, 30, 45, 50]
        // 随机置换
        Collections.shuffle(lt1);
        System.out.println("随机置换后：lt1 = " + lt1); // [30, 10, 45, 20, 50] 随机
        // 实现集合间元素的拷贝
        //List<Integer> lt2 = new ArrayList<>(20);
        List<Integer> lt2 = Arrays.asList(new Integer[10]);
        System.out.println("lt1的大小是：" + lt1.size());
        System.out.println("lt2的大小是：" + lt2.size());
        // 表示将lt1中的元素拷贝到lt2中
        Collections.copy(lt2, lt1);
        System.out.println("lt2 = " + lt2);
    }
}
