package testParalle.cha03.wait_notify_size5;

public class Run {
  public static void main(String[] args) {
    try {
      Object l = new Object();
      ThreadA a = new ThreadA(l);
      a.start();
      Thread.sleep(50);
      ThreadB b = new ThreadB(l);
      b.start();

    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }
}
