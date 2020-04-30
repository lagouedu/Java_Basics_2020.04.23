package com.lagou.task09;

public class SubAbstractTest2 extends AbstractTest {
    @Override
    public void show() {
        System.out.println("使用多态方式可以提高代码的可维护性哦！");
    }

    public void test() {
        System.out.println("第二个子类中独有的方法！");
    }
}
