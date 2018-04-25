package testParalle.cha07.stateTest3;

public class MyService {
  synchronized static public void serviceMethod(){
    try {
      System.out.println(Thread.currentThread().getName() + "进入了该方法"
      +Thread.currentThread().getState());
      Thread.sleep(1000);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }
}
