package com.lagou.task09;

public class FixedAccount extends Account {
    public FixedAccount() {
    }

    public FixedAccount(int i) {
        super(i); // 表示调用父类的有参构造方法
    }

    @Override
    public double getLixi() {
        // 利息 = 本金 * 利率 * 时间
        return getMoney() * 0.03 * 1;
    }

    public static void main(String[] args) {

        // 1.声明Account类型的引用指向子类类型的对象，形成了多态
        //Account acc = new FixedAccount(1000);
        Account acc = new FixedAccount();
        acc.setMoney(1000);
        double res = acc.getLixi();
        System.out.println("计算的利息是：" + res); // 30.0
    }
}
