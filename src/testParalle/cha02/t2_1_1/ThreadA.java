package testParalle.cha02.t2_1_1;

public class ThreadA  extends  Thread{

  private HasSelfPrivateNum numRef;

  public ThreadA(HasSelfPrivateNum numRef) {
    super();
    this.numRef = numRef;
  }

  @Override
  public void run() {
    super.run();
    numRef.addI("a");
  }
}
