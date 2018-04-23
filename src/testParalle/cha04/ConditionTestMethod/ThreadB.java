package testParalle.cha04.ConditionTestMethod;

public class ThreadB extends Thread {
  private MyServicec myService;

  public ThreadB(MyServicec myService) {
    this.myService = myService;
  }

  @Override
  public void run() {
    myService.methodB();
  }
}
