package testParalle.cha02.doubleSynBlockOneTwo;

public class ObjectService {
  public void serviceMethodA(){
    try {
      synchronized (this) {
        System.out.println("A beigi time = " + System.currentTimeMillis());
        Thread.sleep(2000);
        System.out.println("A end time = " + System.currentTimeMillis());
      }
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }

  public void serviceMethodB(){
    synchronized (this) {
      System.out.println("B begin time= " + System.currentTimeMillis());
      System.out.println("B end time= " + System.currentTimeMillis());
    }
  }
}
