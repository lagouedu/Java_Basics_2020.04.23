package com.lagou.task09;

public class ShapeTest {

    // 自定义成员方法实现将参数指定矩形对象特征打印出来的行为，也就是绘制图形的行为
    // Rect r = new Rect(1, 2, 3, 4);
//    public static void draw(Rect r) {
//        r.show(); // 1 2 3 4
//    }
    // 自定义成员方法实现将参数指定圆形对象特征打印出来的行为
//    public static void draw(Circle c) {
//        c.show(); // 5 6 7
//    }
    // 自定义成员方法实现既能打印矩形对象又能打印圆形对象的特征，对象由参数传入  子类 is a 父类
    // Shape s = new Rect(1, 2, 3, 4);   父类类型的引用指向子类类型的对象，形成了多态
    // Shape s = new Circle(5, 6, 7);    多态
    // 多态的使用场合一：通过参数传递形成了多态
    public static void draw(Shape s) {
        // 编译阶段调用父类的版本，运行阶段调用子类重写以后的版本
        s.show();
    }

    public static void main(String[] args) {

        // Rect r = new Rect(1, 2, 3, 4);
        // r.show();
        ShapeTest.draw(new Rect(1, 2, 3, 4));
        ShapeTest.draw(new Circle(5, 6, 7));
    }
}
