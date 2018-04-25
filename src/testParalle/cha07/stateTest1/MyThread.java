package testParalle.cha07.stateTest1;

public class MyThread extends Thread {
  public MyThread(){
    // 打印的是主线程中的状态
    System.out.println("构造中的状态" + Thread.currentThread().getState());
  }

  @Override
  public void run() {
    System.out.println("run方法中的状态"+Thread.currentThread().getState());
  }
}
