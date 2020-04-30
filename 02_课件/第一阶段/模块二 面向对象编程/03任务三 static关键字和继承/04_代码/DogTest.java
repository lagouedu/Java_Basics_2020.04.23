package com.lagou.task08;

public class DogTest {

    public static void main(String[] args) {
        // 1.使用无参方式构造Dog类型的对象并打印特征
        Dog d1 = new Dog();
        d1.show(); // null null 0

        // 2.使用有参方式构造Dog类型的对象并打印特征
        Dog d2 = new Dog("旺财", "白色", 10);
        d2.show(); // 旺财 白色  10
    }
}
