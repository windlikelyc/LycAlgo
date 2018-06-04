package testParalle.cha01.useReturnInterrupt;

public class MyThread extends Thread {
  @Override
  public void run() {
    super.run();
    while (true) {
      if (this.isInterrupted()) {
        System.out.println("停止了");
        return;
      }
      System.out.println("time="+System.currentTimeMillis());
    }
  }
}
