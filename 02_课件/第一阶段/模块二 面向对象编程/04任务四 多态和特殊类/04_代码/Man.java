package com.lagou.task09;

public class Man implements Hunter {
    @Override
    public void hunt() {
        System.out.println("正在追赶一直小白兔...");
    }

    @Override
    public void run() {
        System.out.println("正在被一直大熊追赶，玩命奔跑中...");
    }

    @Override
    public void show1() {
        System.out.println("为了给你几分薄面，我决定重写一下！");
    }

    public static void main(String[] args) {

        // 1.声明接口类型的引用指向实现类的对象，形成了多态
        Runner runner = new Man();
        runner.run();

        Hunter hunter = new Man();
        hunter.hunt();

        System.out.println("-----------------------------------------");
        // 2.可以使用接口名称.的方式调用接口中的静态方法
        Hunter.test();
    }
}
