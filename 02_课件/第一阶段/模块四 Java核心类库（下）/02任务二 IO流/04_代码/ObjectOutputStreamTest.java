package com.lagou.task17;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ObjectOutputStreamTest {

    public static void main(String[] args) {
        ObjectOutputStream oos = null;

        try {
            // 1.创建ObjectOutputStream类型的对象与d:/a.txt文件关联
            oos = new ObjectOutputStream(new FileOutputStream("d:/a.txt"));
            // 2.准备一个User类型的对象并初始化
            User user = new User("qidian", "123456", "13511258688");
            // 3.将整个User类型的对象写入输出流
            oos.writeObject(user);
            System.out.println("写入对象成功！");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            // 4.关闭流对象并释放有关的资源
            if (null != oos) {
                try {
                    oos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
