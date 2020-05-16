package com.lagou.task17;

import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileTest {

    public static void main(String[] args) {
        RandomAccessFile raf = null;

        try {
            // 1.创建RandomAccessFile类型的对象与d:/a.txt文件关联
            raf = new RandomAccessFile("d:/a.txt", "rw");
            // 2.对文件内容进行随机读写操作
            // 设置距离文件开头位置的偏移量，从文件开头位置向后偏移3个字节    aellhello
            raf.seek(3);
            int res = raf.read();
            System.out.println("读取到的单个字符是：" + (char)res); // a l
            res = raf.read();
            System.out.println("读取到的单个字符是：" + (char)res); // h 指向了e
            raf.write('2'); // 执行该行代码后覆盖了字符'e'
            System.out.println("写入数据成功！");

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            // 3.关闭流对象并释放有关的资源
            if (null != raf) {
                try {
                    raf.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
