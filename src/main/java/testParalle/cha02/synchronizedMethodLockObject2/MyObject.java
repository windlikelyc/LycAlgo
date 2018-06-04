package testParalle.cha02.synchronizedMethodLockObject2;

public class MyObject {

  // 这个例子说明了 syn锁的是对象，即使两个线程调用同一个对象的两个不同syn方法，这两个方法也是同步的

  synchronized public void methodA() {
    try {
      System.out.println("begin methodA threadName=" +
          Thread.currentThread().getName());
      Thread.sleep(5000);
      System.out.println("end endTime=" + System.currentTimeMillis());
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }

  synchronized public void methodB() {
    try {
      System.out.println("begin methodB threadName=" +
          Thread.currentThread().getName() + "begin time=" +
          System.currentTimeMillis());
      Thread.sleep(5000);
      System.out.println("end");
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }

}
