package testParalle.cha03.waitInterruptException;

public class Service {
  public void testMethod(Object lock) {
    try {
      synchronized (lock) {
        System.out.println("begin wait()");
        lock.wait();
        System.out.println("  end wait()");
      }
    } catch (InterruptedException e) {
      e.printStackTrace();
      System.out.println("出现异常，因为wait状态的线程被interrupt了");
    }
  }
}
