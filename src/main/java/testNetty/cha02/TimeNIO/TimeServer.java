package testNetty.cha02.TimeNIO;


public class TimeServer {
  public static void main(String[] args) {
    int port = 8080;
    if (args != null && args.length > 0) {
      try {
        port = Integer.valueOf(args[0]);
      } catch (NumberFormatException e) {
      }
    }
      MultipleTimerServer timerServer = new MultipleTimerServer(port);
      new Thread(timerServer, "NIO-MultiplexerTimeServer-001").start();
  }
}
