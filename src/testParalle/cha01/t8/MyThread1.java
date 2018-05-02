package testParalle.cha01.t8;

public class MyThread1 extends Thread{

  @Override
  public void run() {

    try{
      System.out.println("run threadName = " + this.currentThread().getName()+"begin");
      Thread.sleep(2000); // 当前正在执行的县城
      System.out.println("run threadName = " + this.currentThread().getName()+"end");

    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }
}
