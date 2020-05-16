package com.lagou.task17;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileCharCopyTest {

    public static void main(String[] args) {
        FileReader fr = null;
        FileWriter fw = null;

        try {
            // 1.创建FileReader类型的对象与d:/a.txt文件关联
            fr = new FileReader("d:/a.txt");
            //fr = new FileReader("d:/03 IO流的框架图.png");
            // 2.创建FileWriter类型的对象与d:/b.txt文件关联
            fw = new FileWriter("d:/b.txt");
            //fw = new FileWriter("d:/IO流的框架图.png");   拷贝图片文件失败！！！
            // 3.不断地从输入流中读取数据内容并写入到输出流中
            System.out.println("正在玩命地拷贝...");
            int res = 0;
            while ((res = fr.read()) != -1) {
                fw.write(res);
            }
            System.out.println("拷贝文件成功！");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            // 4.关闭流对象并释放有关的资源
            if (null != fw) {
                try {
                    fw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (null != fr) {
                try {
                    fr.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
