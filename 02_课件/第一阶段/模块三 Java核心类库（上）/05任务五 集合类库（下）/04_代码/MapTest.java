package com.lagou.task15;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapTest {

    public static void main(String[] args) {

        // 1.准备一个Map集合并打印
        Map<String, String> m1 = new HashMap<>();
        // 自动调用toString方法，默认打印格式为：{key1=value1, key2=value2, ...}
        System.out.println("m1 = " + m1); // {啥也没有}

        // 2.向集合中添加元素并打印
        String str1 = m1.put("1", "one");
        System.out.println("原来的value数值为：" + str1); // null
        System.out.println("m1 = " + m1); // {1=one}

        str1 = m1.put("2", "two");
        System.out.println("原来的value数值为：" + str1); // null
        System.out.println("m1 = " + m1); // {1=one, 2=two}

        str1 = m1.put("3", "three");
        System.out.println("原来的value数值为：" + str1); // null
        System.out.println("m1 = " + m1); // {1=one, 2=two, 3=three}
        // 实现了修改的功能
        str1 = m1.put("1", "eleven");
        System.out.println("原来的value数值为：" + str1); // one
        System.out.println("m1 = " + m1); // {1=eleven, 2=two, 3=three}

        System.out.println("-------------------------------------------------------------");
        // 3.实现集合中元素的查找操作
        boolean b1 = m1.containsKey("11");
        System.out.println("b1 = " + b1); // false
        b1 = m1.containsKey("1");
        System.out.println("b1 = " + b1); // true

        b1 = m1.containsValue("one");
        System.out.println("b1 = " + b1); // false
        b1 = m1.containsValue("eleven");
        System.out.println("b1 = " + b1); // true

        String str2 = m1.get("5");
        System.out.println("str2 = " + str2); // null
        str2 = m1.get("3");
        System.out.println("str2 = " + str2); // three

        System.out.println("-------------------------------------------------------------");
        // 4.实现集合中元素的删除操作
        str2 = m1.remove("1");
        System.out.println("被删除的value是：" + str2); // eleven
        System.out.println("m1 = " + m1); // {2=two, 3=three}

        System.out.println("-------------------------------------------------------------");
        // 5.获取Map集合中所有的key并组成Set视图
        Set<String> s1 = m1.keySet();
        // 遍历所有的key
        for (String ts : s1) {
            System.out.println(ts + "=" + m1.get(ts));
        }

        System.out.println("-------------------------------------------------------------");
        // 6.获取Map集合中所有的Value并组成Collection视图
        Collection<String> co = m1.values();
        for (String ts : co) {
            System.out.println("ts = " + ts);
        }

        System.out.println("-------------------------------------------------------------");
        // 7.获取Map集合中所有的键值对并组成Set视图
        Set<Map.Entry<String, String>> entries = m1.entrySet();
        for (Map.Entry<String, String> me : entries) {
            System.out.println(me);
        }
    }
}
