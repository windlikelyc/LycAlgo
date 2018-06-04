package testParalle.cha02.t1;

public class ThreadA extends Thread{

  private HasSelfPrivateNume numeRef;
  public ThreadA(HasSelfPrivateNume numeRef){
    super();
    this.numeRef = numeRef;
  }
  @Override
  public void run() {
    super.run();
    numeRef.addI("a");
  }
}
