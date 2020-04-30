package com.lagou.task09;

// 使用implements关键字表达实现的关系，支持多实现
public class Gold implements Metal, Money {
    @Override
    public void shine() {
        System.out.println("发出了金黄色的光芒...");
    }

    @Override
    public void buy() {
        System.out.println("买了好多好吃的...");
    }

    public static void main(String[] args) {

        // 1.声明接口类型的引用指向实现类的对象，形成了多态
        Metal mt = new Gold();
        mt.shine();

        Money mn = new Gold();
        mn.buy();
    }
}
