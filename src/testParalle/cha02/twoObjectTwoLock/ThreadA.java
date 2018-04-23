package testParalle.cha02.twoObjectTwoLock;

public class ThreadA extends Thread {

  private HasSelfPrivateNum numeRef;
  public ThreadA(HasSelfPrivateNum numeRef){
    super();
    this.numeRef = numeRef;
  }
  @Override
  public void run() {
    super.run();
    numeRef.addI("a");
  }
}
