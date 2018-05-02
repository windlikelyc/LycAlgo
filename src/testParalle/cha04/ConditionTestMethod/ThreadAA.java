package testParalle.cha04.ConditionTestMethod;

public class ThreadAA extends Thread {
  private MyServicec myService;

  public ThreadAA(MyServicec myService) {
    this.myService = myService;
  }

  @Override
  public void run() {
    myService.methodA();
  }
}
