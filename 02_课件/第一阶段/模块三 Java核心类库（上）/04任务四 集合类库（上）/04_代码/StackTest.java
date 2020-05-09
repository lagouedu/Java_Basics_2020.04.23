package com.lagou.task14;

import java.util.Stack;

public class StackTest {

    public static void main(String[] args) {

        // 1.准备一个Stack类型的对象并打印
        Stack s1 = new Stack();
        Stack s2 = new Stack();
        System.out.println("s1 = " + s1); // [啥也没有]
        System.out.println("s2 = " + s2); // [啥也没有]

        System.out.println("-----------------------------------------------");
        // 2.将数据11、22、33、44、55依次入栈并打印
        for (int i = 1; i <= 5; i++) {
            Object obj = s1.push(i * 11);
            System.out.println("入栈的元素是：" + obj);
            //System.out.println("栈中的元素有：" + s1); // 11 22 33 44 55
        }

        System.out.println("-----------------------------------------------");
        // 3.查看栈顶元素值并打印
        //Object obj2 = s1.peek();
        //System.out.println("获取到的栈顶元素是：" + obj2); // 55

        System.out.println("-----------------------------------------------");
        // 4.对栈中所有元素依次出栈并打印
        int len = s1.size();
        for (int i = 1; i <= len; i++) {
            Object to = s1.pop();
            //System.out.println("出栈的元素是：" + to); // 55 44 33 22 11
            s2.push(to);
        }

        System.out.println("-----------------------------------------------");
        // 5.最终打印栈中的所有元素
        //System.out.println("s1 = " + s1); // [啥也没有]

        System.out.println("-----------------------------------------------");
        len = s2.size();
        for (int i = 1; i <= len; i++) {
            Object to = s2.pop();
            System.out.println("出栈的元素是：" + to); // 11 22 33 44 55
        }
    }
}
