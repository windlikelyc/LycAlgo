package testParalle.cha04.ReadWriteLockBegin;

public class Run {
  public static void main(String[] args) throws InterruptedException {
    Service service = new Service();

    ThreadB b = new ThreadB(service);
    b.setName("B");
    b.start();

    ThreadA a = new ThreadA(service);
    a.setName("A");
    a.start();

  }
}
