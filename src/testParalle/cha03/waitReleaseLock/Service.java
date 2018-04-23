package testParalle.cha03.waitReleaseLock;

public class Service {
  public void testMethod(Object lock) {
    try {
      synchronized (lock) {
        System.out.println("begin wair()");
//        lock.wait();
        Thread.sleep(3000);
        System.out.println("end wair()");

      }
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }
}
