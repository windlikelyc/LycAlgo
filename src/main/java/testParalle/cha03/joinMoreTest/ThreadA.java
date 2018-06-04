package testParalle.cha03.joinMoreTest;

public class ThreadA extends Thread {
  private ThreadB b;

  public ThreadA(ThreadB b) {
    this.b = b;
  }

  @Override
  public void run() {
    try {
      synchronized (b) {
        System.out.println("begin A threadName = "
        + Thread.currentThread().getName() + " "
        + System.currentTimeMillis());
        Thread.sleep(5000);
        System.out.println("end A threadName = "
            + Thread.currentThread().getName() + " "
            + System.currentTimeMillis());

      }
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }
}
