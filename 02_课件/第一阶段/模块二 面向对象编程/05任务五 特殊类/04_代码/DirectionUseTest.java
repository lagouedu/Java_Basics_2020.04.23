package com.lagou.task10;

public class DirectionUseTest {

    // 自定义静态方法实现根据参数指定的字符串内容来打印具体的方向信息
    public static void test1(String str) {
        switch (str) {
            case "向上":
                System.out.println("抬头望明月！"); break;
            case "向下":
                System.out.println("低头思故乡！"); break;
            case "向左":
                System.out.println("左牵黄"); break;
            case "向右":
                System.out.println("右擎苍"); break;
            default:
                System.out.println("没有这样的方向哦！");
        }
    }

    // 自定义静态方法实现根据参数指定的枚举类型来打印具体的方向信息
    public static void test2(DirectionEnum de) {
        switch (de) {
            case UP:
                System.out.println("抬头望明月！"); break;
            case DOWN:
                System.out.println("低头思故乡！"); break;
            case LEFT:
                System.out.println("左牵黄"); break;
            case RIGHT:
                System.out.println("右擎苍"); break;
            default:
                System.out.println("没有这样的方法哦！");
        }
    }

    public static void main(String[] args) {

        DirectionUseTest.test1(Direction.UP.getDesc());
        DirectionUseTest.test1("今天是个好日子！");

        System.out.println("--------------------------------------------");
        DirectionUseTest.test2(DirectionEnum.DOWN);
        //DirectionUseTest.test2("今天是个好日子！"); Error:类型不匹配，减少了出错的可能性
    }
}
