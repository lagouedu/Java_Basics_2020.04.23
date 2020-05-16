package com.lagou.task17;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ObjectInputStreamTest {

    public static void main(String[] args) {
        ObjectInputStream ois = null;

        try {
            // 1.创建ObjectInputStream类型的对象与d:/a.txt文件关联
            ois = new ObjectInputStream(new FileInputStream("d:/a.txt"));
            // 2.从输入流中读取一个对象并打印
            Object obj = ois.readObject();
            System.out.println("读取到的对象是：" + obj); // qidian 123456 13511258688  null
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            // 3.关闭流对象并释放有关的资源
            if (null != ois) {
                try {
                    ois.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
