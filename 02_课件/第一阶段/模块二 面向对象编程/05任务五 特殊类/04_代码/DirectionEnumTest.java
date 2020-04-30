package com.lagou.task10;

/**
 * 编程实现方向枚举类的测试，调用从Enum类中继承下来的方法
 */
public class DirectionEnumTest {

    public static void main(String[] args) {

        // 1.获取DirectionEnum类型中所有的枚举对象
        DirectionEnum[] arr = DirectionEnum.values();
        // 2.打印每个枚举对象在枚举类型中的名称和索引位置
        for (int i = 0; i < arr.length; i++) {
            System.out.println("获取到的枚举对象名称是：" + arr[i].toString());
            System.out.println("获取到的枚举对象对应的索引位置是：" + arr[i].ordinal()); // 和数组一样下标从0开始
        }

        System.out.println("---------------------------------------------------------------");
        // 3.根据参数指定的字符串得到枚举类型的对象，也就是将字符串转换为对象
        //DirectionEnum de = DirectionEnum.valueOf("向下"); // 编译ok，运行发生IllegalArgumentException非法参数异常
        DirectionEnum de = DirectionEnum.valueOf("DOWN");
        //DirectionEnum de = DirectionEnum.valueOf("UP LEFT"); // 要求字符串名称必须在枚举对象中存在
        //System.out.println("转换出来的枚举对象名称是：" + de.toString());
        System.out.println("转换出来的枚举对象名称是：" + de); // 当打印引用变量时，会自动调用toString方法

        System.out.println("---------------------------------------------------------------");
        // 4.使用获取到的枚举对象与枚举类中已有的对象比较先后顺序
        for(int i = 0; i < arr.length; i++) {
            // 当调用对象在参数对象之后时，获取到的比较结果为 正数
            // 当调用对象在参数对象相同位置时，则获取到的比较结果为 零
            // 当调用对象在参数对象之前时，则获取到的比较结果为 负数
            System.out.println("调用对象与数组中对象比较的先后顺序结果是：" + de.compareTo(arr[i]));
        }

        System.out.println("---------------------------------------------------------------");
        // 5.使用数组中每个DirectionEnum对象都去调用show方法测试
        for (int i = 0; i < arr.length; i++) {
            arr[i].show();
        }
    }
}
