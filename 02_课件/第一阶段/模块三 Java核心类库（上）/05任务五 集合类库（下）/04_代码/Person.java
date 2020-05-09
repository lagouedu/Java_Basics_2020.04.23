package com.lagou.task15;

/**
 * 自定义泛型类Person，其中T相当于形式参数负责占位，具体数值由实参决定
 * @param <T> 看做是一种名字为T的数据类型即可
 */
public class Person<T> {
    private String name;
    private int age;
    private T gender;

    public Person() {
    }

    public Person(String name, int age, T gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
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

    // 不是泛型方法，该方法不能使用static关键字修饰，因为该方法中的T需要在new对象时才能明确类型
    public /*static*/ T getGender() {
        return gender;
    }

    public void setGender(T gender) {
        this.gender = gender;
    }

    // 自定义方法实现将参数指定数组中的所有元素打印出来
    public static <T1> void printArray(T1[] arr) {
        for (T1 tt: arr) {
            System.out.println("tt = " + tt);
        }
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}
