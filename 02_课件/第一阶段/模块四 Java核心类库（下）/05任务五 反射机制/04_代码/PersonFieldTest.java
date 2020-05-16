package com.lagou.task20;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

public class PersonFieldTest {

    public static void main(String[] args) throws Exception {

        // 1.使用原始方式来构造对象以及获取成员变量的数值并打印
        Person p1 = new Person("zhangfei", 30);
        //System.out.println("获取到的成员变量数值为：" + p1.name); // zhangfei

        System.out.println("-------------------------------------------------------");
        // 2.使用反射机制来构造对象以及获取成员变量的数值并打印
        // 2.1 获取Class对象
        Class c1 = Class.forName("com.lagou.task20.Person");
        // 2.2 根据Class对象获取对应的有参构造方法
        Constructor constructor = c1.getConstructor(String.class, int.class);
        // 2.3 使用有参构造方法来得到Person类型的对象
        Object object = constructor.newInstance("zhangfei", 30);
        // 2.4 根据Class对象获取对应的成员变量信息
        Field field = c1.getDeclaredField("name");
        // 设置Java语言访问检查的取消  暴力反射
        field.setAccessible(true);
        // 2.5 使用Person类型的对象来获取成员变量的数值并打印
        // 获取对象object中名字为field成员变量的数值，也就是成员变量name的数值
        System.out.println("获取到的成员变量数值为：" + field.get(object)); // zhangfei

        System.out.println("-------------------------------------------------------");
        // 3.使用原始方式修改指定对象中成员变量的数值后再次打印
        //p1.name = "guanyu";
        //System.out.println("修改后成员变量的数值为：" + p1.name); // guanyu

        System.out.println("-------------------------------------------------------");
        // 4.使用反射机制修改指定对象中成员变量的数值后再次打印
        // 表示修改对象object中名字为field成员变量的数值为guanyu，也就是成员变量name的数值为guanyu
        field.set(object, "guanyu");
        System.out.println("修改后成员变量的数值为：" + field.get(object)); // guanyu

        System.out.println("-------------------------------------------------------");
        // 5.获取Class对象对应类中所有的成员变量
        Field[] declaredFields = c1.getDeclaredFields();
        for (Field ft : declaredFields) {
            System.out.println("获取到的访问修饰符为：" + ft.getModifiers());
            System.out.println("获取到的数据类型为：" + ft.getType());
            System.out.println("获取到的成员变量名称是：" + ft.getName());
            System.out.println("---------------------------------------------");
        }
    }
}
