package com.lagou.task08;

import java.sql.SQLOutput;

public class SuperTest {

    {
        System.out.println("SuperTest类中的构造块！"); // (2)      c
    }

    static {
        System.out.println("SuperTest类中的静态代码块！"); // (1)    a
    }

    public SuperTest() {
        System.out.println("SuperTest类中的构造方法体！"); // (3)    d
    }

    public static void main(String[] args) {

        // 使用无参方式构造对象
        SuperTest st = new SuperTest();
    }
}
