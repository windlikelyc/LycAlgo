package testNetty.cha02.TimeNIO;

public class TimeClient {
  public static void main(String[] args) {
    int port = 8080;
    if (args != null && args.length > 0) {
      try {
        port = Integer.valueOf(args[0]);
      } catch (Exception e) {

      }
    }

    new Thread(new TimeClientHandle("127.0.0.1", port), "wonucaoniba").start();
  }
}
