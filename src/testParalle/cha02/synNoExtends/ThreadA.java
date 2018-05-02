package testParalle.cha02.synNoExtends;

public class ThreadA extends Thread {

  private Sub sub;

  public ThreadA(Sub sub) {
    this.sub = sub;
  }

  @Override
  public void run() {
    sub.serviceMethod();
  }
}
