package com.lagou.task20;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class PersonMethodTest {

    public static void main(String[] args) throws Exception {

        // 1.使用原始方式构造对象并调用方法打印结果
        Person p1 = new Person("zhangfei", 30);
        System.out.println("调用方法的返回值是：" + p1.getName()); // zhangfei

        System.out.println("------------------------------------------------------");
        // 2.使用反射机制构造对象并调用方法打印结果
        // 2.1 获取Class对象
        Class c1 = Class.forName("com.lagou.task20.Person");
        // 2.2 根据Class对象来获取对应的有参构造方法
        Constructor constructor = c1.getConstructor(String.class, int.class);
        // 2.3 使用有参构造方法构造对象并记录
        Object object = constructor.newInstance("zhangfei", 30);
        // 2.4 根据Class对象来获取对应的成员方法
        Method method = c1.getMethod("getName");
        // 2.5 使用对象调用成员方法进行打印
        // 表示使用object对象调用method表示的方法，也就是调用getName方法来获取姓名
        System.out.println("调用方法的返回值是：" + method.invoke(object)); // zhangfei

        System.out.println("------------------------------------------------------");
        // 3.使用反射机制来获取类中的所有成员方法并打印
        Method[] methods = c1.getMethods();
        for (Method mt : methods) {
            System.out.println("成员方法的修饰符是：" + mt.getModifiers());
            System.out.println("成员方法的返回值类型是：" + mt.getReturnType());
            System.out.println("成员方法的名称是：" + mt.getName());
            System.out.println("成员方法形参列表的类型是：");
            Class<?>[] parameterTypes = mt.getParameterTypes();
            for (Class ct : parameterTypes) {
                System.out.print(ct + " ");
            }
            System.out.println();
            System.out.println("成员方法的异常类型列表是：");
            Class<?>[] exceptionTypes = mt.getExceptionTypes();
            for (Class ct: exceptionTypes) {
                System.out.print(ct + " ");
            }
            System.out.println();
            System.out.println("---------------------------------------------------");
        }
    }
}
