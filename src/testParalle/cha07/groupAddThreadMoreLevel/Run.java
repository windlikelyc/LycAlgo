package testParalle.cha07.groupAddThreadMoreLevel;

public class Run {
  public static void main(String[] args) throws InterruptedException {

    ThreadGroup mainGroup = Thread.currentThread().getThreadGroup();
    ThreadGroup group = new ThreadGroup(mainGroup, "A");
    Runnable runnable = new Runnable() {
      @Override
      public void run() {
        try {
          System.out.println("runMethod");
          Thread.sleep(10000);
        } catch (InterruptedException e) {
          e.printStackTrace();
        }

      }
    };
    Thread newThread = new Thread(group, runnable);
    newThread.setName("z");
    newThread.start();

    ThreadGroup[] listGroup = new ThreadGroup[
        Thread.currentThread().getThreadGroup()
        .activeCount()];
    Thread.currentThread().getThreadGroup().enumerate(listGroup);

    Thread.sleep(100);

    System.out.println("main中有子线程组：" + listGroup.length
        + "名字诶" + listGroup[0].getName());

    Thread[] listThread = new Thread[listGroup[0].activeCount()];
    listGroup[0].enumerate(listThread);
    System.out.println(listThread[0].getName());



  }
}
