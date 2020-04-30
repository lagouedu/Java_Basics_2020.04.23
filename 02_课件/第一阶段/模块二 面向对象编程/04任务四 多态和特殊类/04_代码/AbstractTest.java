package com.lagou.task09;

public abstract class AbstractTest {
    private int cnt;

    public AbstractTest() {
    }

    public AbstractTest(int cnt) {
        setCnt(cnt);
    }

    public int getCnt() {
        return cnt;
    }

    public void setCnt(int cnt) {
        this.cnt = cnt;
    }

    // 自定义抽象方法
    public abstract void show();

    public static void main(String[] args) {

        // 声明该类类型的引用指向该类类型的对象
        //AbstractTest at = new AbstractTest();
        //System.out.println("at.cnt = " + at.cnt); // 0
    }
}
