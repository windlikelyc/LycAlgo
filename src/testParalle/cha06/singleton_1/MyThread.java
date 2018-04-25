package testParalle.cha06.singleton_1;

public class MyThread extends Thread{
  @Override
  public void run() {
    try {
      System.out.println(MyObject.getInstance().hashCode());
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }
}
