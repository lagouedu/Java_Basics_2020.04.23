package com.lagou.task17;

import java.io.*;

public class BufferedCharCopyTest {

    public static void main(String[] args) {
        BufferedReader br = null;
        BufferedWriter bw = null;

        try {
            // 1.创建BufferedReader类型的对象与d:/a.txt文件关联
            br = new BufferedReader(new FileReader("d:/a.txt"));
            // 2.创建BufferedWriter类型的对象与d:/b.txt文件关联
            bw = new BufferedWriter(new FileWriter("d:/b.txt"));
            // 3.不断地从输入流中读取一行字符串并写入到输出流中
            System.out.println("正在玩命地拷贝...");
            String str = null;
            while ((str = br.readLine()) != null) {
                bw.write(str);
                bw.newLine(); // 当前系统中的行分隔符是：\r\n
            }
            System.out.println("拷贝文件成功！");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            // 4.关闭流对象并释放有关的资源
            if (null != bw) {
                try {
                    bw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (null != br) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
