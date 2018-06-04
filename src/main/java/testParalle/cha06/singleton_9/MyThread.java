package testParalle.cha06.singleton_9;

public class MyThread extends Thread {
  @Override
  public void run() {
    for (int i = 0; i < 5; i++) {
      System.out.println(MyObject.getConnection().hashCode());

    }
  }
}
