package testParalle.cha03.InheritableThreadLocal;

public class ThreadA extends Thread {
  @Override
  public void run() {
    try {
      for(int i = 0; i < 10;i++) {
        System.out.println("在ThreadA 线程中娶的值="+Tools.t1.get());
        Thread.sleep(100);
      }
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }
}
