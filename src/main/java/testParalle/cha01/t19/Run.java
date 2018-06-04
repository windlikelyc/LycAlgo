package testParalle.cha01.t19;

public class Run {

  public static void main(String[] args) {
    for (int i=0;i < 5;i++) {
      MyThread myThread1 = new MyThread();
      myThread1.setPriority(10);
      myThread1.start();
      MyThread2 thread2 = new MyThread2();
      thread2.setPriority(10);
      thread2.start();
    }
  }
}
