package com.lagou.task13;

public class StringBuilderTest {

    public static void main(String[] args) {

        // 1.使用无参方式构造StringBuilder类型的对象并打印容量和长度
        StringBuilder sb1 = new StringBuilder();
        System.out.println("sb1 = " + sb1); // 自动调用toString方法 啥也没有
        System.out.println("容量是：" + sb1.capacity()); // 16
        System.out.println("长度是：" + sb1.length()); // 0

        System.out.println("-----------------------------------------------------------");
        // 2.使用参数指定的容量来构造对象并打印容量和长度
        StringBuilder sb2 = new StringBuilder(20);
        System.out.println("sb2 = " + sb2); // 自动调用toString方法 啥也没有
        System.out.println("容量是：" + sb2.capacity()); // 20
        System.out.println("长度是：" + sb2.length()); // 0

        System.out.println("-----------------------------------------------------------");
        // 3.根据参数指定的字符串内容来构造对象并打印容量和长度
        StringBuilder sb3 = new StringBuilder("hello");
        System.out.println("sb3 = " + sb3); // 自动调用toString方法  hello
        System.out.println("容量是：" + sb3.capacity()); // 16 + 5 = 21
        System.out.println("长度是：" + sb3.length()); // 5

        System.out.println("-----------------------------------------------------------");
        String str1 = new String("hello");
        String str2 = str1.toUpperCase();
        System.out.println("str2 = " + str2); // HELLO
        System.out.println("str1 = " + str1); // hello  字符串本身是个常量不会改变

        // 4.实现向字符串中插入和追加字符串内容
        // 向下标为0的位置插入字符串内容"abcd"，也就是向开头位置插入字符串内容
        StringBuilder sb4 = sb3.insert(0, "abcd");
        System.out.println("sb4 = " + sb4); // abcdhello  返回调用对象自己的引用，也就是返回值和调用对象是同一个字符串
        System.out.println("sb3 = " + sb3); // abcdhello
        // 向中间位置插入字符串"1234"
        sb3.insert(4, "1234");
        System.out.println("sb3 = " + sb3); // abcd1234hello
        // 向末尾位置插入字符串"ABCD"
        sb3.insert(sb3.length(), "ABCD");
        System.out.println("sb3 = " + sb3); // abcd1234helloABCD

        System.out.println("-----------------------------------------------------------");
        // 向末尾位置追加字符串内容
        sb3.append("world");
        System.out.println("sb3 = " + sb3); // abcd1234helloABCDworld
        // 当字符串的长度超过了字符串对象的初始容量时，该字符串对象会自动扩容，默认扩容算法是：原始容量*2 + 2 => 21*2 + 2 => 44
        // 底层采用byte数组来存放所有的字符内容。
        // ctrl+alt+左右方向键  表示回到上/下一个位置
        System.out.println("容量是：" + sb3.capacity()); // 44
        System.out.println("长度是：" + sb3.length()); // 22

        System.out.println("-----------------------------------------------------------");
        // 5.实现字符串中字符和字符串的删除
        // 表示删除下标为8的单个字符
        sb3.deleteCharAt(8);
        System.out.println("sb3 = " + sb3); // abcd1234elloABCDworld
        // 使用for循环删除多个字符
        for (int i = 8; i < 12; i++) {
            // 由结果可知：删除一个字符后就跳过一个字符继续删除，因为每当删除一个字符后后面的字符会向前补位，因为下标会发生变化
            //sb3.deleteCharAt(i);
            // 始终删除下标为8的字符
            sb3.deleteCharAt(8);
        }
        System.out.println("删除后的字符串是：" + sb3); // abcd1234ABCDworld

        System.out.println("-----------------------------------------------------------");
        // 删除起始字符串abcd，包含0但不包含4
        sb3.delete(0, 4);
        System.out.println("sb3 = " + sb3); // 1234ABCDworld
        // 删除中间字符串
        sb3.delete(4, 8);
        System.out.println("sb3 = " + sb3); // 1234world
        // 删除末尾字符串
        sb3.delete(4, sb3.length());
        System.out.println("sb3 = " + sb3); // 1234

        System.out.println("-----------------------------------------------------------");
        // 6.实现字符串内容的修改、查找以及反转操作
        // 表示将下标为0这个位置的字符修改为'a'
        sb3.setCharAt(0, 'a');
        System.out.println("修改单个字符后的内容是：" + sb3); // a234
        // 修改"234"为"bcd"
        sb3.replace(1, 4, "bcd");
        System.out.println("修改字符串后的结果是：" + sb3); // abcd
        // 实现查找的功能
        int pos = sb3.indexOf("b");
        System.out.println("从前向后查找的结果是：" + pos); // 1
        pos = sb3.lastIndexOf("b");
        System.out.println("从后向前查找的结果是：" + pos); // 1
        // 实现字符串的反转功能
        sb3.reverse();
        System.out.println("反转后的结果是：" + sb3); // dcba

        System.out.println("-----------------------------------------------------------");
        // 7.笔试考点
        // 考点一：既然StringBuilder类的对象本身可以修改，那么为什么成员方法还有返回值呢？
        // 解析：为了连续调用
        //sb3.reverse().append("1").append("2").insert(0, "3").delete(0, 1).reverse();
        // 考点二：如何实现StringBuilder类型和String类型之间的转换呢？
        //String str3 = sb3.toString();
        //StringBuilder sb5 = new StringBuilder(str3);
        // 考点三：String、StringBuilder、StringBuffer之间效率谁高？排列如何？
        // String < StringBuffer < StringBuilder
    }
}
