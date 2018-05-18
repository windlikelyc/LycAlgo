package testNetty.cha02.TimeServerPoll;

import testNetty.cha02.TimerServerHandler;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class TimeServer {
  public static void main(String[] args) throws IOException {
    int port = 8080;
    if (args != null &&args.length > 0) {
      try {
        port = Integer.valueOf(args[0]);
      }catch (Exception e){}
    }

    ServerSocket ss = null;
    try {
      ss = new ServerSocket(port);
      System.out.println("server serves at "+port);
      Socket cs = null;
      TimeServerHandlerExecutePook singleExecutor = new
          TimeServerHandlerExecutePook(50, 10000);
      while (true) {
        cs = ss.accept();
        singleExecutor.execute(new TimerServerHandler(cs));
      }
    } finally {
      System.out.println("server close");
      ss.close();
      ss = null;
    }
  }
}
