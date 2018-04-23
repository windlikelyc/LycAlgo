package testParalle.cha02.atomicIntegerNoSafe;

public class Run {

  public static void main(String[] args) {
    try {
      MyService service = new MyService();
      MyThread[] arr = new MyThread[5];
      for(int i = 0 ; i < arr.length;i++) {
        arr[i] = new MyThread(service);
      }
      for(int i = 0 ; i < arr.length;i++) {
        arr[i].start();
      }
      Thread.sleep(1000);
      System.out.println(service.aiRef.get());
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }
}
