package testParalle.cha01.suspend_resume_LockStop;

public class Run {
  public static void main(String[] args) {
    try {
      MyThread myThread = new MyThread();
      myThread.start();
      Thread.sleep(1000);
      myThread.suspend();
      System.out.println("main end");
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }
}
