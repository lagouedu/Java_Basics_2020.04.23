package com.lagou.task20;

import java.lang.annotation.Annotation;
import java.lang.reflect.Type;

public class StudentTest {

    public static void main(String[] args) throws Exception {

        // 获取Student类型的Class对象
        Class c1 = Class.forName("com.lagou.task20.Student");
        System.out.println("获取到的包信息是：" + c1.getPackage());
        System.out.println("获取到的父类信息是：" + c1.getSuperclass());

        System.out.println("-------------------------------------------------");
        System.out.println("获取到的接口信息是：");
        Class[] interfaces = c1.getInterfaces();
        for (Class ct : interfaces) {
            System.out.print(ct + " ");
        }
        System.out.println();

        System.out.println("-------------------------------------------------");
        System.out.println("获取到的注解信息是：");
        Annotation[] annotations = c1.getAnnotations();
        for (Annotation at : annotations) {
            System.out.print(at + " ");
        }
        System.out.println();

        System.out.println("-------------------------------------------------");
        System.out.println("获取到的泛型信息是：");
        Type[] genericInterfaces = c1.getGenericInterfaces();
        for (Type tt : genericInterfaces) {
            System.out.print(tt + " ");
        }
        System.out.println();
    }
}
