package com.lagou.task17;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest {

    public static void main(String[] args) {
        // 选中代码后可以使用 ctrl+alt+t 来生成异常的捕获代码等
        FileWriter fw = null;

        try {
            // 1.构造FileWrite类型的对象与d:/a.txt文件关联
            // 若文件不存在，该流会自动创建新的空文件
            // 若文件存在，该流会清空文件中的原有内容
            fw = new FileWriter("d:/a.txt");
            // 以追加的方式创建对象去关联文件
            // 若文件不存在则自动创建新的空文件，若文件存在则保留原有数据内容
            //fw = new FileWriter("d:/a.txt", true);
            // 2.通过流对象写入数据内容  每当写入一个字符后则文件中的读写位置向后移动一位
            fw.write('a');

            // 准备一个字符数组
            char[] cArr = new char[]{'h', 'e', 'l', 'l', 'o'};
            // 将字符数组中的一部分内容写入进去
            fw.write(cArr, 1, 3);  // ell
            // 将整个字符数组写进去
            fw.write(cArr); // hello

            // 刷新流
            fw.flush();
            System.out.println("写入数据成功！");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            // 3.关闭流对象并释放有关的资源
            if (null != fw) {
                try {
                    fw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
