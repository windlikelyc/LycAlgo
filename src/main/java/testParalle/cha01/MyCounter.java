package testParalle.cha01;

public class MyCounter extends Thread{
  @Override
  public void run() {
    super.run();
    long beginTime = System.currentTimeMillis();
    for (int i = 0 ; i < 50000000 ; i++) {
      Thread.yield();
    }
    long endTime = System.currentTimeMillis();
    System.out.println("用时"+(endTime-beginTime));
  }
}
