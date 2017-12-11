package vr.xinjing.com.vrmc.utils;

import android.util.Log;

import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;
import java.net.Socket;

/**
 * Created by raytine on 2017/12/4.
 */

public class Client {
    public static void main(String st){
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    TestClient client = TestClientFactory.createClient();
                    client.send(String.format(st, client.client.getLocalPort()));
                    client.receive();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }).start();


//        Socket socket = new Socket("10.12.254.11", 8088);
//
//
//        PrintWriter out = new PrintWriter(new BufferedWriter(
//                new OutputStreamWriter(socket.getOutputStream())), true);
//        out.println("ss");
    }
    /**
     * 生产测试客户端的工厂
     */
    static class TestClientFactory {

        public static TestClient createClient() throws Exception {
            return new TestClient("10.12.254.11", 8088);
        }

    }
    /**
     * 测试客户端
     */
    static class TestClient {

        /**
         * 构造函数
         * @param host 要连接的服务端IP地址
         * @param port 要连接的服务端对应的监听端口
         * @throws Exception
         */
        public TestClient(String host, int port) throws Exception {
            // 与服务端建立连接
            this.client = new Socket(host, port);
            System.out.println("Cliect[port:" + client.getLocalPort() + "] 与服务端建立连接...");
        }

        private Socket client;

        private Writer writer;

        /**
         * 发送消息
         * @param msg
         * @throws Exception
         */
        public void send(String msg) throws Exception {
            // 建立连接后就可以往服务端写数据了
            if(writer == null) {
                writer = new OutputStreamWriter(client.getOutputStream(), "UTF-8");
            }
            writer.write(msg);
            writer.write("eof\n");
            writer.flush();// 写完后要记得flush
            Log.e("----心率数据发送成功","消息发送成功");
        }

        /**
         * 接收消息
         * @throws Exception
         */
        public void receive() throws Exception {
            // 写完以后进行读操作
            Reader reader = new InputStreamReader(client.getInputStream(), "UTF-8");
            // 设置接收数据超时间为10秒
            client.setSoTimeout(10*1000);
            char[] chars = new char[64];
            int len;
            StringBuilder sb = new StringBuilder();
            while ((len = reader.read(chars)) != -1) {
                sb.append(new String(chars, 0, len));
            }
            System.out.println("Cliect[port:" + client.getLocalPort() + "] 消息收到了，内容:" + sb.toString());
            reader.close();

            // 关闭连接
            writer.close();
            client.close();
        }

    }
}
