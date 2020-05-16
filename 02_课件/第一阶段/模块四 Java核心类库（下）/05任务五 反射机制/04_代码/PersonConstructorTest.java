package com.lagou.task20;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Constructor;
import java.util.Scanner;

public class PersonConstructorTest {

    public static void main(String[] args) throws Exception {

        // 1.使用原始方式以无参形式构造Person类型的对象并打印
        Person p1 = new Person();
        System.out.println("无参方式创建的对象是：" + p1); // null 0

        System.out.println("---------------------------------------------------");
        // 2.使用反射机制以无参形式构造Person类型的对象并打印
        // 创建对象的类型可以从键盘输入
        //System.out.println("请输入要创建对象的类型：");
        //Scanner sc = new Scanner(System.in);
        //String str1 = sc.next();
        //Class c1 = Class.forName("com.lagou.task20.Person");
        // 创建对象的类型可以从配置文件中读取
        BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("d:/a.txt")));
        String str1 = br.readLine();
        Class c1 = Class.forName(str1);
        //System.out.println("无参方式创建的对象是：" + c1.newInstance()); // null 0
        // 获取Class对象对应类中的无参构造方法，也就是Person类中的无参构造方法
        Constructor constructor = c1.getConstructor();
        // 使用获取到的无参构造方法来构造对应类型的对象，也就是Person类型的对象
        System.out.println("无参方式创建的对象是：" + constructor.newInstance());
        //sc.close();
        br.close();

        System.out.println("---------------------------------------------------");
        // 3.使用原始方式以有参方式构造Person类型的对象并打印
        Person p2 = new Person("zhangfei", 30);
        System.out.println("有参方式构造的对象是：" + p2); // zhangfei 30

        System.out.println("---------------------------------------------------");
        // 4.使用反射机制以有参方式构造Person类型的对象并打印
        // 获取Class对象对应类中的有参构造方法，也就是Person类中的有参构造方法
        Constructor constructor1 = c1.getConstructor(String.class, int.class);
        // 使用获取到的有参构造方法来构造对应类型的对象，也就是Person类型的对象
        // newInstance方法中的实参是用于给有参构造方法的形参进行初始化的，也就是给name和age进行初始化的
        System.out.println("有参方式构造的对象是：" + constructor1.newInstance("zhangfei", 30)); // zhangfei 30

        System.out.println("---------------------------------------------------");
        // 5.使用反射机制获取Person类中所有的公共构造方法并打印
        Constructor[] constructors = c1.getConstructors();
        for (Constructor ct : constructors) {
            System.out.println("构造方法的访问修饰符是：" + ct.getModifiers());
            System.out.println("构造方法的方法名称是：" + ct.getName());
            Class[] parameterTypes = ct.getParameterTypes();
            System.out.print("构造方法的所有参数类型是：");
            for (Class cs : parameterTypes) {
                System.out.print(cs + " ");
            }
            System.out.println();
            System.out.println("-------------------------------------------------");
        }
    }
}
