package testParalle.cha02.synchronizedOneThreadIn;

public class ObjectService {
  public void serviceMethod(){
    try {
      synchronized (this) {
        System.out.println("begun time = " + System.currentTimeMillis());
        Thread.sleep(2000);
        System.out.println("end time = " + System.currentTimeMillis());
      }
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }
}
