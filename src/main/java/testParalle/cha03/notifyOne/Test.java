package testParalle.cha03.notifyOne;

public class Test {

  public static void main(String[] args) throws InterruptedException {

    Object lock = new Object();
    new ThreadA(lock).start();
    new ThreadB(lock).start();
    new ThreadC(lock).start();
    Thread.sleep(1000);
    new NotifyThread(lock).start();
  }
}
