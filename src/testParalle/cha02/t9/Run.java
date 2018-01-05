package testParalle.cha02.t9;

import testParalle.cha01.MyThread;

public class Run {
  public static void main(String[] args) throws InterruptedException {
    MyOneList list = new MyOneList();
    MyThread1 thread1 = new MyThread1(list);
    thread1.setName("A");
    thread1.start();

    Thread2 thread2 = new Thread2(list);
    thread2.setName("B");
    thread2.start();
    Thread.sleep(6000);
    System.out.println("listSize==" + list.getSize());




  }
}
