package testParalle.cha01.t11;

public class Run {
  public static void main(String[] args) {
    try {
      MyThread myThread = new MyThread();
      myThread.start();
      Thread.sleep(2000);
      myThread.interrupt();
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }
}
