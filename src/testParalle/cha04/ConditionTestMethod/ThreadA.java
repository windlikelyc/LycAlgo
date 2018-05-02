package testParalle.cha04.ConditionTestMethod;


public class ThreadA extends Thread {
  private MyServicec myService;

  public ThreadA(MyServicec myService) {
    this.myService = myService;
  }

  @Override
  public void run() {
    myService.methodA();
  }
}
