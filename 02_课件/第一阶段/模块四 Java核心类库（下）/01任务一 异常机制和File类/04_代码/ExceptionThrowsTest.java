package com.lagou.task16;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionThrowsTest {

    public static void show() throws IOException {
        FileInputStream fis = new FileInputStream("d:/a.txt");
        System.out.println("我想看看你抛出异常后是否继续向下执行？？？");
        fis.close();
    }

    public static void test1() throws IOException {
        show();
    }

    public static void test2() throws IOException {
        test1();
    }

    public static void test3() throws IOException {
        test2();
    }

    // 不建议在main方法中抛出异常   JVM负担很重
    public static void main(String[] args) /*throws IOException*/ {
        try {
            show();
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("------------------------------------");
        try {
            test3();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
