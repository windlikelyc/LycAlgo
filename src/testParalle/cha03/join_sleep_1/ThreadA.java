package testParalle.cha03.join_sleep_1;

public class ThreadA extends Thread {
  private ThreadB b;

  public ThreadA(ThreadB b) {
    this.b = b;
  }

  @Override
  public void run() {
    try {
      synchronized (b) {
        b.start();
        b.join();
        for(int i = 0 ; i < Integer.MAX_VALUE;i++) {
          String s = new String();
          Math.random();
        }
      }


    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }
}
