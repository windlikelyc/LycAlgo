package testParalle.cha01.t12;

public class Run3 {
  public static void main(String[] args) {
    try {
      MyThread thread = new MyThread();
      thread.start();
      Thread.sleep(1000);
      thread.interrupt();
      System.out.println("是否停----------------------止？1"+thread.isInterrupted());
      System.out.println("是否停-----------------------止？2"+thread.isInterrupted());
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }

  // 贼无语，为什么输出两个false，不应该是true吗
  // 原来是睡得时间太少了，直接任务完成了。任务完成后打中断不起作用，所以调用isInterrupt()返回false

}
