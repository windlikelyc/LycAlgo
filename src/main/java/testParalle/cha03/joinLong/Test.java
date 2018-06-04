package testParalle.cha03.joinLong;

public class Test {

  public static void main(String[] args) throws InterruptedException {
    MyThread threadtset = new MyThread();
    threadtset.start();
    threadtset.join(2000);
    System.out.println("end time =" + System.currentTimeMillis());

  }
}
