package com.lagou.task15;

public class SubPersonTest {

    public static void main(String[] args) {

        // 1.声明SubPerson类型的引用指向SubPerson类型的对象并调用set方法进行测试
        //SubPerson<String> sp1 = new SubPerson();  Error: SubPerson类中不支持泛型
        SubPerson sp1 = new SubPerson();
        sp1.setGender("女");

        System.out.println("----------------------------------------");
        //SubPerson<Boolean> sp2 = new SubPerson<>();
        SubPerson<Boolean, String> sp2 = new SubPerson<>();
        sp2.setGender(true);
    }
}
