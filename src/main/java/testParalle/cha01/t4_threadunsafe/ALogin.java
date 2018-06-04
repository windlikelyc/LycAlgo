package testParalle.cha01.t4_threadunsafe;

public class ALogin extends Thread {
  @Override
  public void run() {
    LoginServlet.doPost("a", "aa");
  }
}
