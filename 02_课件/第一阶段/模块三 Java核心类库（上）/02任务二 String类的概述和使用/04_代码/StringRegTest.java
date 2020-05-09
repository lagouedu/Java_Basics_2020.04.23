package com.lagou.task12;

import java.util.Scanner;

public class StringRegTest {

    public static void main(String[] args) {

        // 1.定义描述规则的正则表达式字符串并使用变量记录
        // 正则表达式只能对数据格式进行验证，无法对数据内容的正确性进行检查，内容的正确性检查需要后台查询数据库
        // 描述银行卡密码的规则：由6位数字组成
        //String reg = "^[0-9]{6}$";
        //String reg = "[0-9]{6}";
        //String reg = "\\d{6}";
        // 使用正则表达式描述一下QQ号码的规则：要求是由非0开头的5~15位数字组成。
        //String reg = "[1-9]\\d{4,14}";
        //使用正则表达式描述一下手机号码的规则：要求是由1开头，第二位数是3、4、5、7、8中的一位，总共11位
        //String reg = "1[34578]\\d{9}";
        //描述身份证号码的规则：总共18位，6位数字代表地区，4位数字代表年，2位数字代表月，2位数字代表日期， 3位数字代表个人，
        // 最后一位可能数字也可能是X。
        String reg = "(\\d{6})(\\d{4})(\\d{2})(\\d{2})(\\d{3})([0-9|X])";
        // 2.提示用户从键盘输入指定的内容并使用变量记录
        Scanner sc = new Scanner(System.in);
        while(true) {
            //System.out.println("请输入您的银行卡密码：");
            //System.out.println("请输入您的QQ号码：");
            //System.out.println("请输入您的手机号码：");
            System.out.println("请输入您的身份证号码：");
            String str = sc.next();

            // 3.判断用户输入的字符串内容是否满足指定的规则并打印
            if (str.matches(reg)) {
                //System.out.println("银行卡密码的格式正确！");
                System.out.println("输入字符串的格式正确！");
                break;
            } else {
                //System.out.println("银行卡密码的格式错误！");
                System.out.println("输入字符串的格式错误！");
            }
        }
    }
}
