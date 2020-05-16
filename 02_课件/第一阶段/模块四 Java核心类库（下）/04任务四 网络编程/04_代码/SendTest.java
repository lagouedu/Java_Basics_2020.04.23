package com.lagou.task19;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class SendTest {

    public static void main(String[] args) {
        DatagramSocket ds = null;

        try {
            // 1.创建DatagramSocket类型的对象
            ds = new DatagramSocket();
            // 2.创建DatagramPacket类型的对象并提供接收方的通信地址和端口号
            byte[] bArr = "hello".getBytes();
            DatagramPacket dp = new DatagramPacket(bArr, bArr.length, InetAddress.getLocalHost(), 8888);
            // 3.通过Socket发送Packet，调用send方法
            ds.send(dp);
            System.out.println("发送数据成功！");

            // 接收回发的数据内容
            byte[] bArr2 = new byte[20];
            DatagramPacket dp2 = new DatagramPacket(bArr2, bArr2.length);
            ds.receive(dp2);
            System.out.println("接收到的回发消息是：" + new String(bArr2, 0, dp2.getLength()));

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            // 4.关闭Socket并释放有关的资源
            if (null != ds) {
                ds.close();
            }
        }
    }
}
