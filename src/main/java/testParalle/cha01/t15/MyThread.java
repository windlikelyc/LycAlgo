package testParalle.cha01.t15;

public class MyThread extends Thread {
  @Override
  public void run() {
    super.run();
    try{
      for(int i = 0; i < 1000000;i++) {
        System.out.println("i=" + i);
      }
      System.out.println("run begin");
      Thread.sleep(2000000);
      System.out.println("run end");
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }
}
