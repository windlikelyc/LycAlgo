package testParalle.cha01.currentThreadExt;

public class CountOperation extends Thread{
  public CountOperation(){
    System.out.println("run--begin");
    System.out.println("curname="+Thread.currentThread().getName());
    System.out.println("this.getName="+this.getName());
    System.out.println("countoperationend");
  }

  @Override
  public void run() {
    System.out.println("run--begin");
    System.out.println("curname="+Thread.currentThread().getName());
    System.out.println("this.getName="+this.getName());
    System.out.println("countoperationend");
  }
}
