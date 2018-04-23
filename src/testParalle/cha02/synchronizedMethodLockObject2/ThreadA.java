package testParalle.cha02.synchronizedMethodLockObject2;

public class ThreadA extends Thread {
  private MyObject myObject;

  public ThreadA(MyObject myObject) {
    this.myObject = myObject;
  }
  @Override
  public void run() {
    super.run();
    myObject.methodA();
  }
}
