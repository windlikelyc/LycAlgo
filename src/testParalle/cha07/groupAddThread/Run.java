package testParalle.cha07.groupAddThread;

public class Run {
  public static void main(String[] args) {
    ThreadA aRunnable = new ThreadA();
    ThreadB bRunnable = new ThreadB();
    ThreadGroup group = new ThreadGroup("lyc的线程组");
    Thread a = new Thread(group, aRunnable);
    Thread b = new Thread(group, aRunnable);

    a.start();
    b.start();
    System.out.println("活跃组count为" + group.activeCount());
    System.out.println("活跃组name为" + group.getName());

  }
}
