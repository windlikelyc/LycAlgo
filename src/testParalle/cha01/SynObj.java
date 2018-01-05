package testParalle.cha01;

public class SynObj {
  synchronized public void printString(){
    System.out.println("begin");
    if (Thread.currentThread().getName().equals("a")) {
      System.out.println("a 线程永远suspend了，导致锁总也不释放");
      System.out.println("挂起的是"+Thread.currentThread().getName());
//      Thread.currentThread().suspend();
    }
    System.out.println(Thread.currentThread().getName()+"县城结束end");

  }
}
