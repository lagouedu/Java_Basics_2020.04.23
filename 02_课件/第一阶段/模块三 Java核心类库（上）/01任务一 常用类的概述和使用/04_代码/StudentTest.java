package com.lagou.task11;

public class StudentTest {

    public static void main(String[] args) {

        // 1.使用有参方式构造Student类型的两个对象并判断是否相等
        Student s1 = new Student(1001, "zhangfei");
        //Student s2 = new Student(1002, "guanyu");
        Student s2 = new Student(1001, "zhangfei");
        //Student s2 = s1;  // 表示s2和s1都指向了同一个对象，地址相同了
        // 下面调用从Object类中继承下来的equals方法，该方法默认比较两个对象的地址，可以查看源码验证
        // 当Student类中重写equals方法后，则调用重写以后的版本，比较内容
        //boolean b1 = s1.equals(s2);
        //Student s3 = null;
        //boolean b1 = s1.equals(s3);
        //Student s3 = s1;
        boolean b1 = s1.equals(s2);
        System.out.println("b1 = " + b1); // false true
        System.out.println(s1 == s2); // 比较地址  false

        System.out.println("----------------------------------------------------------");
        // 下面调用从Object类中继承下来的hashCode方法，获取调用对象的哈希码值(内存地址的编号)
        // 当Student类中重写hashCode方法后，则调用重写以后的版本
        int ia = s1.hashCode();
        int ib = s2.hashCode();
        System.out.println("ia = " + ia);
        System.out.println("ib = " + ib);

        System.out.println("----------------------------------------------------------");
        // 下面调用从Object类中继承下来的toString方法，获取调用对象的字符串形式：包名.类名@哈希码值的十六进制
        // 当Student类中重写toString方法后，则调用重写以后的版本：Student[id = 1001, name = zhangfei]
        String str1 = s1.toString();
        System.out.println("str1 = " + str1); // com.lagou.task11.Student@55d
        System.out.println(s1); // 当打印一个引用变量时会自动调用toString方法
        String str2 = "hello" + s1;
        System.out.println("str2 = " + str2);
    }
}
