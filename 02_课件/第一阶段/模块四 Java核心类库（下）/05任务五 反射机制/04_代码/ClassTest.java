package com.lagou.task20;

public class ClassTest {

    public static void main(String[] args) throws ClassNotFoundException {

        // 1.使用数据类型.class的方式可以获取对应类型的Class对象
        Class c1 = String.class;
        System.out.println("c1 = " + c1); // 自动调用toString方法  class java.lang.String
        c1 = int.class;
        System.out.println("c1 = " + c1); // int
        c1 = void.class;
        System.out.println("c1 = " + c1); // void

        System.out.println("---------------------------------------------------");
        // 2.使用对象.getClass()的方式获取对应的Class对象
        String str1 = new String("hello");
        c1 = str1.getClass();
        System.out.println("c1 = " + c1); // class java.lang.String

        Integer it1 = 20;
        c1 = it1.getClass();
        System.out.println("c1 = " + c1); // class java.lang.Integer

        int num = 5;
        //num.getClass(); Error: 基本数据类型的变量不能调用方法

        System.out.println("---------------------------------------------------");
        // 3.使用包装类.TYPE的方式来获取对应基本数据类型的Class对象
        c1 = Integer.TYPE;
        System.out.println("c1 = " + c1); // int

        c1 = Integer.class;
        System.out.println("c1 = " + c1); // class java.lang.Integer

        System.out.println("---------------------------------------------------");
        // 4.调用Class类中的forName方法来获取对应的Class对象
        //c1 = Class.forName("String"); // Error  要求写完整的名称：包名.类名
        c1 = Class.forName("java.lang.String");
        System.out.println("c1 = " + c1); // class java.lang.String

        c1 = Class.forName("java.util.Date");
        System.out.println("c1 = " + c1); // class java.util.Date

        //c1 = Class.forName("int");
        //System.out.println("c1 = " + c1); // 不能获取基本数据类型的Class对象

        System.out.println("---------------------------------------------------");
        // 5.使用类加载器的方式来获取Class对象
        ClassLoader classLoader = ClassTest.class.getClassLoader();
        System.out.println("classLoader = " + classLoader); // null
        c1 = classLoader.loadClass("java.lang.String");
        System.out.println("c1 = " + c1); // class java.lang.String
    }
}
