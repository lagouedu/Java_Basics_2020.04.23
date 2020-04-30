package com.lagou.task09;

public /*final*/ abstract class Account {
    private int money;

    public Account() {
    }

    public Account(int money) {
        setMoney(money);
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        if (money >= 0) {
            this.money = money;
        } else {
            System.out.println("金额不合理哦！！！");
        }
    }

    // 自定义抽象方法实现计算利息并返回的功能描述
    public abstract double getLixi();
    // private 和 abstract 关键字不能共同修饰一个方法
    //private abstract double getLixi();
    // final 和 abstract 关键字不能共同修饰一个方法
    //public final abstract double getLixi();
    // static 和 abstract 关键字不能共同修饰一个方法
    //public static abstract double getLixi();
}
