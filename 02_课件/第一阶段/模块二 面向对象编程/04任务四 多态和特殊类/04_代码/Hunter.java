package com.lagou.task09;

// 接口只能继承接口，不能继承类
public interface Hunter extends Runner {
    // 自定义成员方法描述捕猎的行为
    public abstract void hunt();

    // 将两个默认方法中重复的代码可以提取出来打包成一个方法在下面的两个方法中分别调用即可
    private void show() {
        System.out.println("在以后的开发中尽量减少重复的代码，也就是减少代码的冗余！");
    }
    // 增加一个抽象方法
    //public abstract void show1();
    // 增加非抽象方法
    public default void show1() {
        show();
        //System.out.println("在以后的开发中尽量减少重复的代码，也就是减少代码的冗余！");
        System.out.println("show1方法中：这里仅仅是接口中的默认功能，实现类可以自由选择是否重写！");
    }

    // 增加非抽象方法
    public default void show2() {
        show();
        //System.out.println("在以后的开发中尽量减少重复的代码，也就是减少代码的冗余！");
        System.out.println("show2方法中：这里仅仅是接口中的默认功能，实现类可以自由选择是否重写！");
    }

    // 增加静态方法 隶属于类层级，也就是接口层级
    public static void test() {
        System.out.println("这里是静态方法，可以直接通过接口名.的方式调用，省略对象的创建");
    }


}
