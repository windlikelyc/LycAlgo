package testParalle.cha03.notifyOne;

public class Service {
  public void testMethod(Object lock) {
    try {
      synchronized (lock) {
        System.out.println("begin wait() THreadName = "
            + Thread.currentThread().getName());
        lock.wait();
        System.out.println("end wait() THreadName = "
            + Thread.currentThread().getName());

      }
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }
}
