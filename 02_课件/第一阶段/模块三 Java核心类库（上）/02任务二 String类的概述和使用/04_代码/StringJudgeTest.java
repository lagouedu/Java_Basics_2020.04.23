package com.lagou.task12;

public class StringJudgeTest {

    public static void main(String[] args) {

        // 1.创建字符串对象并打印
        String str1 = new String("上海自来水来自海上");
        System.out.println("str1 = " + str1); // 上海自来水来自海上   9
        // 2.判断该字符串内容是否为回文并打印
        for (int i = 0; i < str1.length()/2; i++) {
            if (str1.charAt(i) != str1.charAt(str1.length()-i-1)) {  // 0和8   1和7  2和6  3和5
                System.out.println(str1 + "不是回文！");
                return;  // 仅仅是用于实现方法的结束
            }
        }
        System.out.println(str1 + "是回文！");
    }
}
