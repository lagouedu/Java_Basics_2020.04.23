package com.lagou.task10;

// 表示将标签MyAnnotation贴在Person类的代码中，使用注解时采用 成员参数名 = 成员参数值, ...
//@MyAnnotation(value = "hello", value2 = "world")
@MyAnnotation(value2 = "world")
public class Person {
    /**
     * name是用于描述姓名的成员变量
     */
    @MyAnnotation(value2 = "1")
    private String name;
    /**
     * age是用于描述年龄的成员变量
     */
    private int age;

    /**
     * 编程实现无参构造方法
     */
    @MyAnnotation(value2 = "2")
    public Person() {
    }

    /**
     * 编程实现有参构造方法
     * @param name
     * @param age
     */
    public Person(@MyAnnotation(value2 = "4") String name, int age) {
        this.name = name;
        this.age = age;
    }

    /**
     * 自定义成员方法实现特征的获取和修改
     * @return
     */
    @MyAnnotation(value2 = "3")
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
}


