package testParalle.cha02.twoObjectTwoLock;

public class ThreadB extends  Thread {
  private HasSelfPrivateNum numeRef;
  public ThreadB(HasSelfPrivateNum numeRef){
    super();
    this.numeRef = numeRef;
  }
  @Override
  public void run() {
    super.run();
    numeRef.addI("b");
  }
}
