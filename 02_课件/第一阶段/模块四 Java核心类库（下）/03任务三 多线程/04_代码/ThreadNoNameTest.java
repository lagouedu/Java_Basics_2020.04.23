package com.lagou.task18;

public class ThreadNoNameTest {

    public static void main(String[] args) {

        // 匿名内部类的语法格式：父类/接口类型 引用变量名 = new 父类/接口类型() { 方法的重写 };
        // 1.使用继承加匿名内部类的方式创建并启动线程
        /*Thread t1 = new Thread() {
            @Override
            public void run() {
                System.out.println("张三说：在吗？");
            }
        };
        t1.start();*/
        new Thread() {
            @Override
            public void run() {
                System.out.println("张三说：在吗？");
            }
        }.start();

        // 2.使用实现接口加匿名内部类的方式创建并启动线程
        /*Runnable ra = new Runnable() {
            @Override
            public void run() {
                System.out.println("李四说：不在。");
            }
        };
        Thread t2 = new Thread(ra);
        t2.start();*/
        /*new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("李四说：不在。");
            }
        }).start();*/
        // Java8开始支持lambda表达式： (形参列表)->{方法体；}
        /*Runnable ra = ()-> System.out.println("李四说：不在。");
        new Thread(ra).start();*/

        new Thread(()-> System.out.println("李四说：不在。")).start();
    }
}
