package com.lagou.task10;

public class AnonymousInterfaceTest {

    // 假设已有下面的方法，请问如何调用下面的方法？
    // AnonymousInterface ai = new AnonymousInterfaceImpl();
    // 接口类型的引用指向实现类型的对象，形成了多态
    public static void test(AnonymousInterface ai) {
        // 编译阶段调用父类版本，运行调用实现类重写的版本
        ai.show();
    }

    public static void main(String[] args) {

        //AnonymousInterfaceTest.test(new AnonymousInterface()); // Error:接口不能实例化
        AnonymousInterfaceTest.test(new AnonymousInterfaceImpl());

        System.out.println("---------------------------------------------------------------");
        // 使用匿名内部类的语法格式来得到接口类型的引用，格式为：接口/父类类型 引用变量名 = new 接口/父类类型() { 方法的重写 };
        AnonymousInterface ait = new AnonymousInterface() {
            @Override
            public void show() {
                System.out.println("匿名内部类就是这么玩的，虽然你很抽象！");
            }
        };

        // 从Java8开始提出新特性lamda表达式可以简化上述代码，格式为：(参数列表) -> {方法体}
        AnonymousInterface ait2 = () -> System.out.println("lamda表达式原来是如此简单！");
        AnonymousInterfaceTest.test(ait2);
    }
}
