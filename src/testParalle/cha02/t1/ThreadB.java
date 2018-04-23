package testParalle.cha02.t1;

public class ThreadB extends Thread{
  private HasSelfPrivateNume numeRef;
  public ThreadB(HasSelfPrivateNume numeRef){
    super();
    this.numeRef = numeRef;
  }
  @Override
  public void run() {
    super.run();
    numeRef.addI("b");
  }
}
