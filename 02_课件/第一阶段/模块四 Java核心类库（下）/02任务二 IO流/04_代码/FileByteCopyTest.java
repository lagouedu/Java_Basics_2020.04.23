package com.lagou.task17;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileByteCopyTest {

    public static void main(String[] args) {

        // 获取当前系统时间距离1970年1月1日0时0分0秒的毫秒数
        long g1 = System.currentTimeMillis();

        FileInputStream fis = null;
        FileOutputStream fos = null;

        try {
            // 1.创建FileInputStream类型的对象与d:/03 IO流的框架图.png文件关联
            //fis = new FileInputStream("d:/03 IO流的框架图.png");
            fis = new FileInputStream("d:/02_IO流的框架结构.mp4");
            // 2.创建FileOutputStream类型的对象与d:/IO流的框架图.png文件关联
            //fos = new FileOutputStream("d:/IO流的框架图.png");
            fos = new FileOutputStream("d:/IO流的框架结构.mp4");
            // 3.不断地从输入流中读取数据内容并写入到输出流中
            System.out.println("正在玩命地拷贝...");
            // 方式一：以单个字节为单位进行拷贝，也就是每次读取一个字节后再写入一个字节
            // 缺点：文件稍大时，拷贝的效率很低
            /*int res = 0;
            while ((res = fis.read()) != -1) {
                fos.write(res);
            }*/
            // 方式二：准备一个和文件大小一样的缓冲区，一次性将文件中的所有内容取出到缓冲区然后一次性写入进去
            // 缺点：若文件过大时，无法申请和文件大小一样的缓冲区，真实物理内存不足
            /*int len = fis.available();
            System.out.println("获取到的文件大小是：" + len);
            byte[] bArr = new byte[len];
            int res = fis.read(bArr);
            System.out.println("实际读取到的文件大小是：" + res);
            fos.write(bArr);*/
            // 方式三：准备一个相对适当的缓冲区，分多次将文件拷贝完成
            byte[] bArr = new byte[1024];
            int res = 0;
            while ((res = fis.read(bArr)) != -1) {
                fos.write(bArr, 0, res);
            }

            System.out.println("拷贝文件成功！");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            // 4.关闭流对象并释放有关的资源
            if (null != fos) {
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (null != fis) {
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        long g2 = System.currentTimeMillis();
        System.out.println("使用文件流拷贝视频文件消耗的时间为：" + (g2-g1));  // 165
    }
}
