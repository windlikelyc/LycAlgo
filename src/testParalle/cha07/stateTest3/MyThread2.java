package testParalle.cha07.stateTest3;

public class MyThread2 extends Thread {

  @Override
  public void run() {
    MyService.serviceMethod();
  }
}
