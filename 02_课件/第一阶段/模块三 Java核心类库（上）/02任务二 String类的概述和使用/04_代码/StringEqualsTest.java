package com.lagou.task12;

import java.util.Scanner;

public class StringEqualsTest {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        for (int i = 3; i > 0; i--) {
            // 1.提示用户从键盘输入用户名和密码信息并使用变量记录
            System.out.println("请输入您的用户名和密码信息：");
            String userName = sc.next();
            String password = sc.next();

            // 2.判断用户名和密码是否为"admin"和"123456"并给出提示
            //if ("admin".equals(userName) && "123456".equals(password)) {
            if ("admin".equalsIgnoreCase(userName) && "123456".equals(password)) { // 防止空指针异常
                System.out.println("登录成功，欢迎使用！");
                break;
            } //else {
            if (1 == i) {
                System.out.println("账户已冻结，请联系客服人员！");
            } else {
                System.out.println("用户名或密码错误，您还有" + (i - 1) + "次机会！");
            }
            //}
        }
        // 关闭扫描器
        sc.close();
    }
}
