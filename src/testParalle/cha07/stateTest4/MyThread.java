package testParalle.cha07.stateTest4;

public class MyThread extends Thread {
  @Override
  public void run() {
    try {
      synchronized (Lock.lock) {
        Lock.lock.wait();
      }
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }
}
