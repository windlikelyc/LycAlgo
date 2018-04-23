package testParalle.cha03.joinTest1;

public class Test {
  public static void main(String[] args) throws InterruptedException {
    MyThread threadTest = new MyThread();
    threadTest.start();
    threadTest.join();
    // Thread.sleep();
    System.out.println("end");
  }
}
