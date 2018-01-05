package testParalle.cha01;

public class MyThread2 extends Thread{
  public MyThread2(){
    System.out.println("构造方法的打印"+Thread.currentThread().getName());
  }

  @Override
  public void run(){
    System.out.println("run方法打印："+Thread.currentThread().getName());

  }
}
