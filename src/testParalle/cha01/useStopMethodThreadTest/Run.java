package testParalle.cha01.useStopMethodThreadTest;

public class Run {

  public static void main(String[] args) {
    try{
      MyThread myThread = new MyThread();
      myThread.start();
      Thread.sleep(8000);
      myThread.stop();
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }
}
