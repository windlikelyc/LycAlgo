package testParalle.cha01.t4_threadunsafe;

public class BLogin extends Thread {
  @Override
  public void run() {
    LoginServlet.doPost("b", "bb");

  }
}
