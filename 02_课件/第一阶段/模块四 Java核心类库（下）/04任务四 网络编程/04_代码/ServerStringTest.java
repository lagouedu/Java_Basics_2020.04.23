package com.lagou.task19;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerStringTest {

    public static void main(String[] args) {
        ServerSocket ss = null;
        Socket s = null;

        try {
            // 1.创建ServerSocket类型的对象并提供端口号
            ss = new ServerSocket(8888);

            // 2.等待客户端的连接请求，调用accept方法
            while(true) {
                System.out.println("等待客户端的连接请求...");
                // 当没有客户端连接时，则服务器阻塞在accept方法的调用这里
                s = ss.accept();
                System.out.println("客户端" + s.getInetAddress() + "连接成功！");
                // 每当有一个客户端连接成功，则需要启动一个新的线程为之服务
                new ServerThread(s).start();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            // 4.关闭Socket并释放有关的资源
            if (null != ss) {
                try {
                    ss.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
