package testParalle.cha02.t9;

import java.util.concurrent.FutureTask;
import java.util.concurrent.Semaphore;

public class MyThread1 extends Thread {
  private MyOneList list;

  public MyThread1(MyOneList list) {
    super();
    this.list = list;
  }

  @Override
  public void run(){
    Service sRef = new Service();
    sRef.addServiceMethod(list, "A");
  }
}
