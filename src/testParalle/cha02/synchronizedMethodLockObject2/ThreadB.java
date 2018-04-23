package testParalle.cha02.synchronizedMethodLockObject2;

public class ThreadB extends Thread {
  private MyObject myObject;

  public ThreadB(MyObject myObject) {
    this.myObject = myObject;
  }
  @Override
  public void run() {
    super.run();
    myObject.methodB();
  }
}
