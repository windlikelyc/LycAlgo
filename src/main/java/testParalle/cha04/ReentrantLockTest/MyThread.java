package testParalle.cha04.ReentrantLockTest;

public class MyThread extends Thread {
  private MyService myService;

  public MyThread(MyService myService) {
    this.myService = myService;
  }

  @Override
  public void run() {
    myService.testMethod();
  }
}
