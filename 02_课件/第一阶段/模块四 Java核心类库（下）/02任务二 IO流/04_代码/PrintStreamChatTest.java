package com.lagou.task17;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public class PrintStreamChatTest {

    public static void main(String[] args) {

        // 由手册可知：构造方法需要的是Reader类型的引用，但Reader类是个抽象类，实参只能传递子类的对象  字符流
        // 由手册可知： System.in代表键盘输入， 而且是InputStream类型的 字节流
        BufferedReader br = null;
        PrintStream ps = null;
        try {
            br = new BufferedReader(new InputStreamReader(System.in));
            ps = new PrintStream(new FileOutputStream("d:/a.txt", true));

            // 声明一个boolean类型的变量作为发送方的代表
            boolean flag = true;

            while(true) {
                // 1.提示用户输入要发送的聊天内容并使用变量记录
                System.out.println("请" + (flag? "张三": "李四") + "输入要发送的聊天内容：");
                String str = br.readLine();
                // 2.判断用户输入的内容是否为"bye"，若是则聊天结束
                if ("bye".equals(str)) {
                    System.out.println("聊天结束！");
                    break;
                }
                // 3.若不是则将用户输入的内容写入到文件d:/a.txt中
                //else {
                // 获取当前系统时间并调整格式
                Date d1 = new Date();
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                ps.println(sdf.format(d1) + (flag?" 张三说：":" 李四说：") + str);
                //}
                flag = !flag;
            }
            ps.println(); // 写入空行 与之前的聊天记录隔开
            ps.println();
            ps.println();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            // 4.关闭流对象并释放有关的资源
            if (null != ps) {
                ps.close();
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
