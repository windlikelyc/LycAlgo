package testParalle.cha03.notifyHoldLock;

public class Test {
  public static void main(String[] args) {

    Object lock = new Object();
    ThreadA a = new ThreadA(lock);
    a.start();
    NotifyThread notifyThread = new NotifyThread(lock);
    notifyThread.start();
    synNotifyMethodThread c = new synNotifyMethodThread(lock);
    c.start();

  }
}
