package com.lagou.task17;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class DataInputStreamTest {

    public static void main(String[] args) {
        DataInputStream dis = null;

        try {
            // 1.创建DataInputStream类型的对象与d:/a.txt文件关联
            dis = new DataInputStream(new FileInputStream("d:/a.txt"));
            // 2.从输入流中读取一个整数并打印
            //int res = dis.readInt(); // 读取4个字节
            int res = dis.read();      // 读取1个字节
            System.out.println("读取到的整数数据是：" + res); // 66
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            // 3.关闭流对象并释放有关的资源
            if (null != dis) {
                try {
                    dis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
