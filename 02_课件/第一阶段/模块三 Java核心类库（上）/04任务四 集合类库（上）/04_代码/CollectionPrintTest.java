package com.lagou.task14;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

public class CollectionPrintTest {

    public static void main(String[] args) {

        // 1.准备一个Collection集合并放入元素后打印
        Collection c1 = new ArrayList();
        c1.add("one");
        c1.add(2);
        c1.add(new Person("zhangfei", 30));
        // 遍历方式一： 自动调用toString方法   String类型的整体
        System.out.println("c1 = " + c1); // [one, 2, Person{name='zhangfei', age=30}]

        System.out.println("------------------------------------------------");
        // 2.遍历方式二：使用迭代器来遍历集合中的所有元素  更加灵活
        // 2.1 获取当前集合中的迭代器对象
        Iterator iterator1 = c1.iterator();
        /*
        // 2.2 判断是否有元素可以访问
        System.out.println(iterator1.hasNext()); // true
        // 2.3 取出一个元素并指向下一个
        System.out.println("获取到的元素是：" + iterator1.next()); // one

        System.out.println(iterator1.hasNext()); // true
        System.out.println("获取到的元素是：" + iterator1.next()); // 2

        System.out.println(iterator1.hasNext()); // true
        System.out.println("获取到的元素是：" + iterator1.next()); // Person{name='zhangfei', age=30}

        System.out.println(iterator1.hasNext()); // false
        System.out.println("获取到的元素是：" + iterator1.next()); // 编译ok，运行发生NoSuchElementException没有这样的元素异常
         */
        while (iterator1.hasNext()) {
            System.out.println("获取到的元素是：" + iterator1.next());
        }

        System.out.println("------------------------------------------------");
        // 由于上个循环已经使得迭代器走到了最后，因此需要重置迭代器
        iterator1 = c1.iterator();
        // 3.使用迭代器来模拟toString方法的打印效果
        StringBuilder sb1 = new StringBuilder();
        sb1.append("[");
        while (iterator1.hasNext()) {
            Object obj = iterator1.next();
            // 当获取的元素是最后一个元素时，则拼接元素加中括号
            if (!iterator1.hasNext()) {
                sb1.append(obj).append("]");
            } else {
                // 否则拼接元素加逗号加空格
                sb1.append(obj).append(",").append(" ");
            }
        }
        // [one, 2, Person{name='zhangfei', age=30}]
        System.out.println("c1 = " + sb1);

        System.out.println("------------------------------------------------");
        // 4.不断地去获取集合中的元素并判断，当元素值为"one"时则删除该元素
        iterator1 = c1.iterator();
        while (iterator1.hasNext()) {
            Object obj = iterator1.next();
            if("one".equals(obj)) {
                iterator1.remove();  //使用迭代器的remove方法删除元素没问题
                //c1.remove(obj); // 使用集合的remove方法编译ok，运行发生ConcurrentModificationException并发修改异常
            }
        }
        System.out.println("删除后集合中的元素有：" + c1); // [2, Person{name='zhangfei', age=30}]

        System.out.println("------------------------------------------------");
        // 5.使用 for each结构实现集合和数组中元素的遍历  代码简单且方法灵活
        // 由调试源码可知：该方式确实是迭代器的简化版
        for (Object obj : c1) {
            System.out.println("取出来的元素是：" + obj);
        }

        int[] arr = new int[] {11, 22, 33, 44, 55};
        for (int i : arr) {
            System.out.println("i = " + i);
            i = 66; // 修改局部变量i的数值，并不是修改数组中元素的数值
        }
        System.out.println("数组中的元素有：" + Arrays.toString(arr));

    }
}
