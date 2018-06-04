package testNetty.cha02;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

// 同步阻塞I/O的服务器
public class TimeServer {

  public static void main(String[] args) throws IOException{
    int port = 8080;
    if (args != null && args.length > 0) {
      try {
        port = Integer.valueOf(args[0]);
      } catch (NumberFormatException e) {
        // 采用默认值
      }
    }
    ServerSocket server = null;
    try {
      server = new ServerSocket(port);
      System.out.println("The time server is start in port:" + port);
      Socket socket = null;
      while (true) {
        // 每次都卡这儿
        socket = server.accept();
        new Thread(new TimerServerHandler(socket)).start();
        System.out.println("haha");
      }
    } finally {
      if (server != null) {
        System.out.println("The time server close");
        server.close();
        server = null;
      }
    }
  }
}
