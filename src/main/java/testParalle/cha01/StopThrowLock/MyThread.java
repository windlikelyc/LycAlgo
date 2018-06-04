package testParalle.cha01.StopThrowLock;

public class MyThread extends Thread {
  private SynchronizedObject object;

  public MyThread(SynchronizedObject p) {
    super();
    this.object = p;
  }

  @Override
  public void run() {
    object.printString("b","bb");
  }
}
