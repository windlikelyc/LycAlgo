package testParalle.cha01.t3;

public class MyThread  extends Thread{
  private int count = 5;

  @Override
  synchronized public void run() {
    super.run();
    count--;
    System.out.println("you"+this.currentThread().getName()+"jisuan,count="+count);
  }
}
