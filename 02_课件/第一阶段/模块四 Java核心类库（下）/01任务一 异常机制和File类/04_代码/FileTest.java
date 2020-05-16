package com.lagou.task16;

import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Date;

public class FileTest {

    // 自定义成员方法实现指定目录以及子目录中所有内容的打印
    public static void show(File file) {
        // 获取目录f3下的所有内容并记录到一维数组中
        File[] filesArray = file.listFiles();
        // 遍历数组
        for (File tf: filesArray) {
            String name = tf.getName();
            // 判断是否为文件，若是则直接打印文件名称
            if (tf.isFile()) {
                System.out.println(name);
            }
            // 若是目录，则使用[]将目录名称括起来
            if (tf.isDirectory()) {
                System.out.println("[" + name + "]");
                show(tf);
            }
        }
    }

    public static void main(String[] args) throws IOException {

        // 1.构造File类型的对象与d:/a.txt文件关联
        File f1 = new File("d:/a.txt");
        // 2.若文件存在则获取文件的相关特征信息并打印后删除文件
        if (f1.exists()) {
            System.out.println("文件的名称是：" + f1.getName());
            System.out.println("文件的大小是：" + f1.length());
            Date d1 = new Date(f1.lastModified());
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            System.out.println("文件的最后一次修改时间：" + sdf.format(d1));
            // 绝对路径： 主要指以根目录开始的路径信息，如：c:/  d:/   /..
            // 相对路径： 主要指以当前目录所在位置开始的路径信息，如：./  ../   相对路径
            System.out.println("文件的绝对路径信息是：" + f1.getAbsolutePath());
            System.out.println(f1.delete()? "文件删除成功": "文件删除失败");
        } else {
            // 3.若文件不存在则创建新的空文件
            System.out.println(f1.createNewFile()? "文件创建成功": "文件创建失败！");
        }

        System.out.println("---------------------------------------------------------");
        // 4.实现目录的删除和创建
        File f2 = new File("d:/捣乱/猜猜我是谁/你猜我猜不猜/死鬼");
        if (f2.exists()) {
            System.out.println("目录名称是：" + f2.getName());
            System.out.println(f2.delete()? "目录删除成功": "目录删除失败");
        } else {
            //System.out.println(f2.mkdir()? "目录创建成功": "目录创建失败");   // 创建单层目录
            System.out.println(f2.mkdirs()? "目录创建成功": "目录创建失败");   // 创建多层目录
        }

        System.out.println("---------------------------------------------------------");
        // 5.实现将指定目录中的所有内容打印出来
        File f3 = new File("d:/捣乱");
        // 获取目录f3下的所有内容并记录到一维数组中
        File[] filesArray = f3.listFiles();
        // 遍历数组
        for (File tf: filesArray) {
            String name = tf.getName();
            // 判断是否为文件，若是则直接打印文件名称
            if (tf.isFile()) {
                System.out.println(name);
            }
            // 若是目录，则使用[]将目录名称括起来
            if (tf.isDirectory()) {
                System.out.println("[" + name + "]");
            }
        }

        System.out.println("---------------------------------------------------------");
        // 6.实现目录中所有内容获取的同时进行过滤
        // 匿名内部类的语法格式：接口/父类类型 引用变量名 = new 接口/父类类型() { 方法的重写 };
        /*FileFilter fileFilter = new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                // 若文件名是以.avi为结尾，则返回true表示保留   否则返回false就是表示丢弃
                return pathname.getName().endsWith(".avi");
            }
        };*/
        // Lambda表达式的格式：(参数列表) -> {方法体}
        FileFilter fileFilter = (File pathname) -> {return pathname.getName().endsWith(".avi");};
        File[] filesArray2 = f3.listFiles(fileFilter);
        for (File tf : filesArray2) {
            System.out.println(tf);
        }

        System.out.println("---------------------------------------------------------");
        // 7.使用递归的思想获取目录以及子目录中的内容
        show(new File("d:/捣乱"));
    }
}
