package testParalle.cha02.t6;

public class MyThread1 extends Thread {
  private Task task;

  public MyThread1(Task task) {
    this.task = task;
  }

  @Override
  public void run() {
    super.run();
    CommonUtis.beginTime1 = System.currentTimeMillis();
    task.doLongTimeTask();
    CommonUtis.endTime1 = System.currentTimeMillis();
  }
}
