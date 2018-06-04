package testParalle.cha01.t13;

public class Run {

  public static void main(String[] args) {
    try{
      MyThread m = new MyThread();
      m.start();
      Thread.sleep(2000);
      m.interrupt();
      System.out.println(m.isInterrupted());
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }
}
