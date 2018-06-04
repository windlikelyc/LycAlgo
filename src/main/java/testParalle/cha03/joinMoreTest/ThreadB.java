package testParalle.cha03.joinMoreTest;

public class ThreadB extends Thread{

  @Override
  synchronized public void run() {
    try {
      System.out.println("begin B threadName = "
          + Thread.currentThread().getName() + " "
          + System.currentTimeMillis());
      Thread.sleep(5000);
      System.out.println("end B threadName = "
          + Thread.currentThread().getName() + " "
          + System.currentTimeMillis());
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }
}
