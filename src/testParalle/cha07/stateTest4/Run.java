package testParalle.cha07.stateTest4;

public class Run {
  public static void main(String[] args) {
    try {
      MyThread t = new MyThread();
      t.start();
      Thread.sleep(1000);
      System.out.println("main 方法中的t状态:"+ t.getState());
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }
}
