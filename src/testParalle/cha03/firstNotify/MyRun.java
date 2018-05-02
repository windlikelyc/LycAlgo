package testParalle.cha03.firstNotify;

public class MyRun {
  private String lock = new String("");
  private  boolean isFirst = false;
  private Runnable runnableA = new Runnable() {
    @Override
    public void run() {
      try {
        synchronized (lock) {
          while (isFirst == false) {
            System.out.println("begin wait");
            lock.wait();
            System.out.println("end wait");
          }
        }
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
  };

  private Runnable runnableB = new Runnable() {
    @Override
    public void run() {
      synchronized (lock) {
        lock.notify();
        isFirst = true;
      }
    }
  };

  public static void main(String[] args) throws InterruptedException {
    MyRun myRun = new MyRun();

    Thread b = new Thread(myRun.runnableB);
    b.start();
    Thread.sleep(1000);
    Thread a = new Thread(myRun.runnableA);
    a.start();
  }
}
