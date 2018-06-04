package testParalle.cha02.atomicIntegerNoSafe;

public class MyThread extends Thread {
  private MyService myService;

  public MyThread(MyService myService) {
    this.myService = myService;
  }

  @Override
  public void run() {
    super.run();
    myService.addNum();

  }
}
