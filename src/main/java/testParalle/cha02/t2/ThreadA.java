package testParalle.cha02.t2;

public class ThreadA extends Thread{

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
