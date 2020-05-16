package com.lagou.task16;

public class PersonTest {

    public static void main(String[] args) {

        /*Person p1 = null;
        try {
            p1 = new Person("zhangfei", -30);
        } catch (AgeException e) {
            e.printStackTrace();
        }
        System.out.println("p1 = " + p1); // zhangfei 0*/
        Person p1 = new Person("zhangfei", -30);
        System.out.println("p1 = " + p1); // zhangfei 0  null
    }
}
