package testParalle.cha01.t13forprint;

public class MyThread extends Thread {
  @Override
  public void run() {
    super.run();
    try {
      for (int i = 0; i < 500000; i++) {
        if (this.interrupted()) {
          System.out.println("已经是停止状态了，我要退书");
          throw new InterruptedException();
        }
        System.out.println("i=" + i);
      }
      System.out.println("我要退书，但是线程继续运行");
    } catch (InterruptedException e) {
      System.out.println("进入catch");
      e.printStackTrace();
    }
  }
}
