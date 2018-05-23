package testNetty.cha02.TimeAIO;

public class TimeServer {
  public static void main(String[] args) {
    int port = 8080;
    if (args != null && args.length > 0) {
      try {
        port = Integer.valueOf(args[0]);

      } catch (NumberFormatException e) {

      }
    }

    AsynTimeServerHandler timeServer = new AsynTimeServerHandler(port);
    new Thread(timeServer, "AIO_001").start();
  }
}
