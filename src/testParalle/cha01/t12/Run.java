package testParalle.cha01.t12;

public class Run {

  public static void main(String[] args) {
    try {
      MyThread myThread = new MyThread();
      myThread.start();
      Thread.sleep(1000);
//      myThread.interrupt();
      Thread.currentThread().interrupt();
      System.out.println("是否停止？1"+Thread.currentThread().isInterrupted());
      System.out.println("是否停止？2"+Thread.currentThread().isInterrupted());
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    System.out.println("end");
  }
}
