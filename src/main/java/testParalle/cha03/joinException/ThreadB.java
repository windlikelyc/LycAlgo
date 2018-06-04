package testParalle.cha03.joinException;

public class ThreadB extends Thread {
  @Override
  public void run() {
    try {
      ThreadA a = new ThreadA();
      a.start();
      a.join();
      System.out.println("线程B在run end 处被打印了");
    } catch (InterruptedException e) {
      System.out.println("线程B在catch 处被打印了");
      e.printStackTrace();
    }
  }
}
