package com.lagou.task08;

// 导入java目录中lang目录中System类中的静态成员out  很少使用
import static java.lang.System.out;

public class SubSuperTest extends SuperTest {

    {
        System.out.println("==========SubSuperTest类中的构造块！"); // (2)      e
    }

    static {
        System.out.println("==========SubSuperTest类中的静态代码块！"); // (1)   b
    }

    public SubSuperTest() {
        //System.out.println("==========SubSuperTest类中的构造方法体！"); // (3)  f
        out.println("==========SubSuperTest类中的构造方法体！");
    }

    public static void main(String[] args) {

        // 使用无参方式构造子类的对象
        SubSuperTest sst = new SubSuperTest();
    }
}
