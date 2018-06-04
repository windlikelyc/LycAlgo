package testParalle.cha01.suspend_resume_deal_lock;

public class Run {

  public static void main(String[] args) {
    try {
      final SynchronizedObject object = new SynchronizedObject();
      Thread thread1 = new Thread() {
        @Override
        public void run() {
          object.printString();
        }
      };
      thread1.setName("a");
      thread1.start();
      Thread.sleep(1000);

      Thread thread2 = new Thread() {
        @Override
        public void run() {
          System.out.println("2never");
          object.printString();
        }
      };
      thread2.start();
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }
}
