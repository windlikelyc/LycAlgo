package testParalle.cha04.z3_ok;

public class MyThreadA extends Thread {
  private MyService myService;

  public MyThreadA(MyService myService) {
    this.myService = myService;
  }

  @Override
  public void run() {
    myService.waitMethod();
  }
}
