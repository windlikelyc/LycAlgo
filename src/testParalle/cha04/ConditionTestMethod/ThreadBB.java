package testParalle.cha04.ConditionTestMethod;

public class ThreadBB extends Thread {
  private MyServicec myService;

  public ThreadBB(MyServicec myService) {
    this.myService = myService;
  }

  @Override
  public void run() {
    myService.methodB();
  }
}
