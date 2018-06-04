package testParalle.cha07.groupAddThread;

public class ThreadB extends Thread {
  @Override
  public void run() {
    try {
      while (!Thread.currentThread().isInterrupted()) {
        System.out.println("Name="
            +Thread.currentThread().getName());
        Thread.sleep(1000);
      }
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }
}
