package testParalle.cha03.waitHasParamMethod;

import testParalle.cha01.Run;

public class MyRunnable {

  static private Object lock = new Object();
  static private Runnable runnable = new Runnable() {
    @Override
    public void run() {
      try {
        synchronized (lock) {
          System.out.println("wait begin timer = " + System.currentTimeMillis());
          lock.wait(5000);
          System.out.println("wait end timer = " + System.currentTimeMillis());
        }
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
  };

  static private Runnable runnable2 = new Runnable() {
    @Override
    public void run() {
      synchronized (lock) {
        System.out.println("notify beigin timer =" + System.currentTimeMillis());
        lock.notify();
        System.out.println("notify end timer =" + System.currentTimeMillis());

      }
    }
  };

  public static void main(String[] args) throws InterruptedException {
    Thread t = new Thread(runnable);
    t.start();
    Thread.sleep(300);
    Thread t2 = new Thread(runnable2);
    t2.start();
  }


}
