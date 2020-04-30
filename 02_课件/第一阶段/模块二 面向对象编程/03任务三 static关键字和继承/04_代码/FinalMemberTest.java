package com.lagou.task08;

public class FinalMemberTest {
//    private final int cnt = 1; // 显式初始化
    private final int cnt;

    /*{
        cnt = 2;  // 构造块中进行初始化
    }*/

    public FinalMemberTest() {
        cnt = 3; // 构造方法体中进行初始化
    }

    public static void main(String[] args) {

        // 声明FinalMemberTest类型的引用指向该类的对象
        FinalMemberTest fmt = new FinalMemberTest();
        // 打印成员变量的数值
        System.out.println("fmt.cnt = " + fmt.cnt); // 0  1  2  3
    }
}
