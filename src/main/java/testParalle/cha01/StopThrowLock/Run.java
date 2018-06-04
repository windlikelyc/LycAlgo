package testParalle.cha01.StopThrowLock;

public class Run {
  public static void main(String[] args) {
    try {
      SynchronizedObject synchronizedObject = new SynchronizedObject();
      MyThread myThread = new MyThread(synchronizedObject);
      myThread.start();
      Thread.sleep(500);
      myThread.stop();
      System.out.println(synchronizedObject.getPassword()+
      synchronizedObject.getUsername());
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }
}
