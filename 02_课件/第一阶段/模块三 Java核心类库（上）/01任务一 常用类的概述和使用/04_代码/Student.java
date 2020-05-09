package com.lagou.task11;

import java.util.Objects;

public class Student extends Object {
    private int id; // 用于描述学号的成员变量
    private String name; // 用于描述姓名的成员变量

    public Student() {
    }

    public Student(int id, String name) {
        setId(id);
        setName(name);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        if (id > 0) {
            this.id = id;
        } else {
            System.out.println("学号不合理哦！！！");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return id == student.id &&
                Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
/*
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Student student = (Student) o;

        if (id != student.id) return false;
        return name != null ? name.equals(student.name) : student.name == null;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }

 */
    /**
     * 为了比较两个对象的内容，也就是学号信息需要重写该方法
     */
    // Student this = s1;
    // Object obj = s2;
    /*
    @Override
    public boolean equals(Object obj) {
        // 当调用对象和参数对象指向同一个对象时，则内容一定相同
        if (this == obj) return true;
        // 当调用对象为不为空而参数对象为空时，则内容一定不相同
        if (null == obj) return false;
        // 判断obj指向的对象是否为Student类型的对象，若是则条件成立，否则条件不成立
        if (obj instanceof Student) {
            Student ts = (Student) obj;
            // 以学号作为基准判断两个对象是否相等  int是基本数据类型，内存空间中放的就是数据本身，使用 == 可以判断数据是否相同
            //return this.getId() == ts.getId();
            // 以姓名作为基准判断两个对象是否相等  String是引用数据类型，内存空间中放的是地址，使用 == 判断地址是否相同
            // 也就是判断两个对象中姓名字符串的地址是否相同，不够完美
            //return this.getName() == ts.getName();
            return this.getName().equals(ts.getName()); // 比较姓名字符串的地址是否相同
        }
        // 否则类型不一致没有可比性，则内容一定不相同
        return false;
    }
    */
    /**
     * 为了使得该方法的结果与equals方法的结果保持一致，从而满足Java官方的常规协定，需要重写该方法
     */
    /*
    @Override
    public int hashCode() {
        //return getId(); // 不再代表内存地址的编号了
        final int type = 12;
        //return type*31 + getId();
        return type*31 + getName().hashCode();
    }
    */
    /**
     * 为了返回更有意义的字符串数据，则需要重写该方法
     */
    /*
    @Override
    public String toString() {
        return "Student[id = " + getId() + ", name = " + getName() + "]";
    }
     */
}

