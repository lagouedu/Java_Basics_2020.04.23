package com.lagou.task14;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class CollectionTest {

    public static void main(String[] args) {

        // 1.准备一个Collection集合并打印
        //Collection c1 = new Collection();  // 接口不能实例化，也就是不能创建对象
        // 接口类型的引用指向实现类的对象，形成了多态
        Collection c1 = new ArrayList();
        // 自动调用toString方法，调用ArrayList类中的toString方法，默认打印格式为：[元素值1, 元素值2, ...]
        System.out.println("集合中的元素有：" + c1); // [啥也没有]

        System.out.println("--------------------------------------------------------");
        // 2.向集合中添加单个元素并打印
        boolean b1 = c1.add(new String("one"));
        System.out.println("b1 = " + b1); // true
        System.out.println("集合中的元素有：" + c1); // [one]

        b1 = c1.add(Integer.valueOf(2));
        System.out.println("b1 = " + b1); // true
        System.out.println("集合中的元素有：" + c1); // [one, 2]

        b1 = c1.add(new Person("zhangfei", 30));
        System.out.println("b1 = " + b1); // true
        // 打印集合中的所有元素时，本质上就是打印集合中的每个对象，也就是让每个对象调用对应类的toString方法
        System.out.println("集合中的元素有：" + c1); // [one, 2, Person{name='zhangfei', age=30}]

        System.out.println("--------------------------------------------------------");
        // 3.向集合中添加多个元素并打印
        Collection c2 = new ArrayList();
        c2.add("three");  // 常量池
        c2.add(4);        // 自动装箱机制
        System.out.println("c2 = " + c2); // [three, 4]
        // 将c2中的所有元素全部添加到集合c1中，也就是将集合c2中的元素一个一个依次添加到集合c1中
        b1 = c1.addAll(c2);
        // 表示将集合c2整体看做一个元素添加到集合c1中
        //b1 = c1.add(c2);
        System.out.println("b1 = " + b1);
        // [one, 2, Person{name='zhangfei', age=30}, three, 4]    [one, 2, Person{name='zhangfei', age=30}, [three, 4]]
        System.out.println("c1 = " + c1);

        System.out.println("--------------------------------------------------------");
        // 4.判断集合中是否包含参数指定的单个元素
        b1 = c1.contains(new String("one"));
        System.out.println("b1 = " + b1); // true

        b1 = c1.contains(new String("two"));
        System.out.println("b1 = " + b1); // false

        b1 = c1.contains(Integer.valueOf(2));
        System.out.println("b1 = " + b1); // true

        b1 = c1.contains(Integer.valueOf(3));
        System.out.println("b1 = " + b1); // false
        // contains方法的工作原理是：Objects.equals(o, e)，其中o代表contains方法的形式参数，e代表集合中的每个元素
        // 也就是contains的工作原理就是 拿着参数对象与集合中已有的元素依次进行比较，比较的方式调用Objects中的equals方法
        // 而该方法equals的工作原理如下：
        /*
        public static boolean equals(Object a, Object b) {    其中a代表Person对象，b代表集合中已有的对象
            return (a == b) || (a != null && a.equals(b));
            元素包含的第一种方式就是：Person对象与集合中已有对象的地址相同
                     第二种方式就是：Person对象不为空，则Person对象调用equals方法与集合中已有元素相等
        }
        */
        // 当Person类中没有重写equals方法时，则调用从Object类中继承下来的equals方法，比较两个对象的地址  false
        // 当Person类中重写equals方法后，则调用重写以后的版本，比较两个对象的内容  true
        b1 = c1.contains(new Person("zhangfei", 30));
        System.out.println("b1 = " + b1); // true  false

        System.out.println("--------------------------------------------------------");
        // [one, 2, Person{name='zhangfei', age=30}, three, 4]
        System.out.println("c1 = " + c1);

        // 5.判断当前集合中是否包含参数指定集合的所有元素
        Collection c3 = new ArrayList();
        c3.add(4);
        System.out.println("c3 = " + c3); // [4]

        // 判断集合c1中是否包含集合c3中的所有元素
        b1 = c1.containsAll(c3);
        System.out.println("b1 = " + b1); // true

        c3.add("five");
        System.out.println("c3 = " + c3); // [4, five]
        // 判断集合c1中是否包含集合c3中的所有元素，只有集合c3中的所有元素都在集合c1中出现才会返回true，否则都是false
        b1 = c1.containsAll(c3);
        System.out.println("b1 = " + b1); // false

        // 笔试考点
        System.out.println("c2 = " + c2); // [three, 4]
        b1 = c1.containsAll(c2);
        System.out.println("b1 = " + b1); // true false
        // 判断集合c1中是否拥有集合c2这个整体为单位的元素
        b1 = c1.contains(c2);
        System.out.println("b1 = " + b1); // false true

        System.out.println("--------------------------------------------------------");
        // 6.计算两个集合的交集并保留到当前集合中
        System.out.println("c2 = " + c2); // [three, 4]
        System.out.println("c3 = " + c3); // [4, five]
        // 也就是让集合自己和自己取交集，还是自己，也就是当前集合中的元素没有发生改变
        b1 = c2.retainAll(c2);
        System.out.println("b1 = " + b1); // false 表示当前集合中的元素没有发生改变
        System.out.println("c2 = " + c2); // [three, 4]
        // 计算集合c2和c3的交集并保留到集合c2中，取代集合c2中原有的数值
        b1 = c2.retainAll(c3);
        System.out.println("b1 = " + b1); // true 当前集合的元素发生了改变
        System.out.println("c2 = " + c2); // [4]
        System.out.println("c3 = " + c3); // [4, five]

        System.out.println("--------------------------------------------------------");
        // 7.实现集合中单个元素的删除操作
        // [one, 2, Person{name='zhangfei', age=30}, three, 4]
        System.out.println("c1 = " + c1);
        // 删除参数指定的单个元素
        b1 = c1.remove(1);
        System.out.println("b1 = " + b1); // false
        // [one, 2, Person{name='zhangfei', age=30}, three, 4]
        System.out.println("c1 = " + c1);

        b1 = c1.remove("one");
        System.out.println("b1 = " + b1); // true
        // [2, Person{name='zhangfei', age=30}, three, 4]
        System.out.println("c1 = " + c1);

        // remove方法的工作原理：Objects.equals(o, e)
        b1 = c1.remove(new Person("zhangfei", 30));
        System.out.println("b1 = " + b1); // true
        // [2, three, 4]
        System.out.println("c1 = " + c1);

        System.out.println("--------------------------------------------------------");
        // 8.实现集合中所有元素的删除操作
        System.out.println("c3 = " + c3); // [4, five]
        // 从集合c1中删除集合c3中的所有元素，本质上就是一个一个元素进行删除，有元素则删除，否则不删除
        b1 = c1.removeAll(c3);
        System.out.println("b1 = " + b1); // true
        // [2, three]
        System.out.println("c1 = " + c1);
        System.out.println("c3 = " + c3); // [4, five]

        // 笔试考点  删除整体对象c3
        b1 = c1.remove(c3);
        System.out.println("b1 = " + b1); // false
        System.out.println("c1 = " + c1); // [2, three]

        System.out.println("--------------------------------------------------------");
        // 9.实现集合中其它方法的测试   ctrl+n 可以直接搜索并打开类的源码  使用ctrl+f12可以搜索类中的方法
        System.out.println("集合中元素的个数为：" + c1.size()); // 2
        System.out.println(0 == c1.size() ? "集合已经空了": "集合还没有空"); // 没有空
        System.out.println(c1.isEmpty()? "集合已经空了": "集合还没有空"); // 没有空
        // 清空集合中的所有元素
        c1.clear();
        System.out.println("集合中元素的个数为：" + c1.size()); // 0
        System.out.println(0 == c1.size() ? "集合已经空了": "集合还没有空"); // 已经空了
        System.out.println(c1.isEmpty()? "集合已经空了": "集合还没有空");   // 已经空了

        // 准备两个集合并判断是否相等
        Collection c4 = new ArrayList();
        c4.add(1);
        c4.add(2);
        System.out.println("c4 = " + c4); // [1, 2]
        Collection c5 = new ArrayList();
        c5.add(1);
        c5.add(2);
        c5.add(3);
        System.out.println("c5 = " + c5); // [1, 2, 3]
        // 判断是否相等
        b1 = c4.equals(c5);
        System.out.println("b1 = " + b1); // true  false

        System.out.println("--------------------------------------------------------");
        // 10.实现集合和数组类型之间的转换   通常认为：集合是用于取代数组的结构
        // 实现集合向数组类型的转换
        Object[] objects = c5.toArray();
        // 打印数组中的所有元素
        System.out.println("数组中的元素有：" + Arrays.toString(objects)); // [1, 2, 3]
        // 实现数组类型到集合类型的转换
        Collection objects1 = Arrays.asList(objects);
        System.out.println("集合中的元素有：" + objects1); // [1, 2, 3]
    }
}
