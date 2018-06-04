package testParalle.cha04.MustUseMoreCondition_Error;

public class ThreadB extends Thread{
  private MyService myService;

  public ThreadB(MyService myService) {
    this.myService = myService;
  }

  @Override
  public void run() {
    myService.awaitB();
  }
}
