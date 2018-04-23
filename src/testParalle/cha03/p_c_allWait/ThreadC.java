package testParalle.cha03.p_c_allWait;

public class ThreadC extends Thread {
  private C c;

  public ThreadC(C c) {
    this.c = c;
  }

  public void run(){
    while (true) {
      c.getValue();
    }
  }
}
