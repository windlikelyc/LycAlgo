package testParalle.cha02.t2;

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
