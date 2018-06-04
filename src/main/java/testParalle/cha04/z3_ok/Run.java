package testParalle.cha04.z3_ok;

import testParalle.cha01.z.MyThread;

public class Run {
  public static void main(String[] args) {
    MyService myService = new MyService();
    MyThreadA a = new MyThreadA(myService);
    a.start();
  }
}
