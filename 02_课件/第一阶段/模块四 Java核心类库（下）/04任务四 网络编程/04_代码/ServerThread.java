package com.lagou.task19;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.InetAddress;
import java.net.Socket;

public class ServerThread extends Thread {
    private Socket s;

    public ServerThread(Socket s) {
        this.s = s;
    }

    @Override
    public void run() {
        BufferedReader br = null;
        PrintStream ps = null;

        try {
            // 3.使用输入输出流进行通信
            br = new BufferedReader(new InputStreamReader(s.getInputStream()));
            ps = new PrintStream(s.getOutputStream());

            while(true) {
                // 实现对客户端发来字符串内容的接收并打印
                // 当没有数据发来时，下面的方法会形成阻塞
                String s1 = br.readLine();
                InetAddress inetAddress = s.getInetAddress();
                System.out.println("客户端" + inetAddress + "发来的字符串内容是：" + s1);
                // 当客户端发来的内容为"bye"时，则聊天结束
                if ("bye".equalsIgnoreCase(s1)) {
                    System.out.println("客户端" + inetAddress + "已下线！");
                    break;
                }
                // 实现服务器向客户端回发字符串内容"I received!"
                ps.println("I received!");
                System.out.println("服务器发送数据成功！");
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (null != ps) {
                ps.close();
            }
            if (null != br) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (null != s) {
                try {
                    s.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
