package testParalle.cha01.t14;

public class Run {
  public static void main(String[] args) {
    try {
      MyThread m = new MyThread();
      m.start();
      Thread.sleep(2000);
      m.interrupt();
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    System.out.println("end");
  }

}
