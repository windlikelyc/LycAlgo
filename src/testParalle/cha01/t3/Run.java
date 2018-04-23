package testParalle.cha01.t3;

public class Run {
  public static void main(String[] args) {
    MyThread myThread = new MyThread();
    Thread a = new Thread(myThread, "A");
    Thread b = new Thread(myThread, "B");
    Thread c = new Thread(myThread, "C");
    Thread d = new Thread(myThread, "D");
    a.start();
    b.start();
    c.start();
    d.start();




  }
}
