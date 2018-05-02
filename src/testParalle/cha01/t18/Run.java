package testParalle.cha01.t18;

public class Run {

  public static void main(String[] args) {
    System.out.println("main begin run priority = " + Thread.currentThread().getPriority());
    Thread.currentThread().setPriority(6);
    System.out.println("main end run priority = " + Thread.currentThread().getPriority());
    new MyThread1().start();

  }
}
