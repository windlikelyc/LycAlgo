package testParalle.cha03.joinMoreTest;

public class RunFirst {
  public static void main(String[] args) throws InterruptedException {
    ThreadB b = new ThreadB();
    ThreadA a = new ThreadA(b);
    b.start();
    a.start();
    System.out.println("   main end " + System.currentTimeMillis());

  }

}
