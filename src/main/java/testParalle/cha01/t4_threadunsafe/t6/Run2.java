package testParalle.cha01.t4_threadunsafe.t6;

public class Run2 {
  public static void main(String[] args) {
    MyThread myThread = new MyThread();
//    myThread.start();

    myThread.run();
  }
}
