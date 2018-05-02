package testParalle.cha01.suspend_resume_nosameValue;

public class Run {

  public static void main(String[] args) {
    final MyObject myObject = new MyObject();
    Thread thread1 = new Thread() {
      @Override
      public void run() {
        myObject.setValue("a", "aa");
      }
    };
    thread1.setName("a");
    thread1.start();
    try {
      Thread.sleep(500);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    Thread thread2 = new Thread() {
      @Override
      public void run() {
        myObject.printusernamePassword();
      }
    };
    thread2.start();
  }

}
