package testParalle.cha01.t17;

public class MyThread extends Thread {
  @Override
  public void run() {
    long beginTIme = System.currentTimeMillis();
    int count = 0;
    for(int i = 0 ; i < 5000000;i++) {
//      Thread.yield();
      count = count + i;
    }
    long endTime = System.currentTimeMillis();
    System.out.println("用时："+(endTime-beginTIme)+"m秒");

  }
}
