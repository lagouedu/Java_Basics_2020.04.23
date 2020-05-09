package com.lagou.task15;

public class Student implements Comparable<Student> {
    private String name;
    private int age;

    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        //return 0;   // 调用对象和参数对象相等，调用对象就是新增加的对象
        //return -1;  // 调用对象小于参数对象
        //return 1;     // 调用对象大于参数对象
        //return this.getName().compareTo(o.getName());  // 比较姓名
        //return this.getAge() - o.getAge(); // 比较年龄
        /*
        int ia = this.getName().compareTo(o.getName());
        if (0 == ia) {
            return this.getAge() - o.getAge();
        }
        return ia;
         */
        int ia = this.getName().compareTo(o.getName());
        return 0 != ia? ia : this.getAge() - o.getAge();
    }
}
