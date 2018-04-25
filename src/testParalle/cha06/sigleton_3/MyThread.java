package testParalle.cha06.sigleton_3;

public class MyThread extends Thread {
  @Override
  public void run() {
    System.out.println(MyObject.getInstance().hashCode());
  }
}
