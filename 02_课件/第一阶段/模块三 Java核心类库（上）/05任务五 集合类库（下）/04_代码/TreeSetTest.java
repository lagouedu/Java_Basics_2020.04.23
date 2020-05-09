package com.lagou.task15;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetTest {

    public static void main(String[] args) {

        // 1.准备一个TreeSet集合并打印
        Set<String> s1 = new TreeSet<>();
        System.out.println("s1 = " + s1); // [啥也没有]

        // 2.向集合中添加String类型的对象并打印
        boolean b1 = s1.add("aa");
        System.out.println("b1 = " + b1); // true
        System.out.println("s1 = " + s1); // [aa]

        b1 = s1.add("cc");
        System.out.println("b1 = " + b1); // true
        System.out.println("s1 = " + s1); // [aa, cc]

        b1 = s1.add("bb");
        System.out.println("b1 = " + b1); // true
        // 由于TreeSet集合的底层是采用红黑树实现的，因此元素有大小次序，默认从小到大打印
        System.out.println("s1 = " + s1); // [aa, bb, cc]

        System.out.println("----------------------------------------------------------");
        // 4.准备一个比较器对象作为参数传递给构造方法
        // 匿名内部类： 接口/父类类型 引用变量名 = new 接口/父类类型() { 方法的重写 };
        /*
        Comparator<Student> comparator = new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {  // o1表示新增加的对象  o2表示集合中已有的对象
                return o1.getAge() - o2.getAge(); // 表示按照年龄比较
            }
        };
        */
        // 从Java8开始支持Lambda表达式: (参数列表) -> { 方法体 }
        Comparator<Student> comparator = (Student o1, Student o2) -> { return o1.getAge() - o2.getAge(); };

        // 3.准备一个TreeSet集合并放入Student类型的对象并打印
        //Set<Student> s2 = new TreeSet<>();
        Set<Student> s2 = new TreeSet<>(comparator);
        s2.add(new Student("zhangfei", 35));
        s2.add(new Student("zhangfei", 30));
        s2.add(new Student("guanyu", 35));
        s2.add(new Student("liubei", 40));
        System.out.println("s2 = " + s2);
    }
}
