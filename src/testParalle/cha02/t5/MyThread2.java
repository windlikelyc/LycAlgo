package testParalle.cha02.t5;

public class MyThread2 extends Thread {
  private Task task;

  public MyThread2(Task task) {
    this.task = task;
  }

  @Override
  public void run() {
    super.run();
    CommonUtis.beginTime2 = System.currentTimeMillis();
    task.doLongTimeTask();
    CommonUtis.endTime2 = System.currentTimeMillis();
  }
}
