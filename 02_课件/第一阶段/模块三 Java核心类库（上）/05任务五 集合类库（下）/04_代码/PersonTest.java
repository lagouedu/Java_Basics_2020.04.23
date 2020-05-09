package com.lagou.task15;

public class PersonTest {

    public static void main(String[] args) {

        // 1.声明Person类型的引用指向Person类型的对象
        Person p1 = new Person("zhangfei", 30, "男");
        // 2.打印对象的特征
        System.out.println(p1); // zhangfei 30 男

        System.out.println("-----------------------------------");
        // 3.在创建对象的同时指定数据类型，用于给T进行初始化
        Person<String> p2 = new Person<>();
        p2.setGender("女");
        System.out.println(p2); // null  0  女

        System.out.println("-----------------------------------");
        // 4.使用Boolean类型作为性别的类型
        Person<Boolean> p3 = new Person<>();
        p3.setGender(true);
        System.out.println(p3); // null 0  true

        System.out.println("-----------------------------------");
        // 5.调用泛型方法进行测试
        Integer[] arr = {11, 22, 33, 44, 55};
        Person.printArray(arr); // 11 22 33 44 55
    }
}
