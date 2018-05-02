package testParalle.cha04.Fair_noFait_test;

public class RunFait {
  public static void main(String[] args) {
    final Service service = new Service(false);
    Runnable runnable = new Runnable() {
      @Override
      public void run() {
        System.out.println("线程" + Thread.currentThread().getName() + "运行了");
        service.serviceMethod();
      }
    };
    Thread[] threadArray = new Thread[10];
    for(int i = 0; i < 10;i++) {
      threadArray[i] = new Thread(runnable);
    }

    for(int i = 0; i < 10;i++) {
      threadArray[i].start();
    }
  }
}
