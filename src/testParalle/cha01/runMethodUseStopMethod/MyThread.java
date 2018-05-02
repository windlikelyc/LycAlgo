package testParalle.cha01.runMethodUseStopMethod;

public class MyThread extends Thread {
  @Override
  public void run() {
    super.run();
    try {
      this.stop();
    } catch (ThreadDeath threadDeath) {
      System.out.println("进入乐catch");
      threadDeath.printStackTrace();
    }
  }
}
