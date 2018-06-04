package testParalle.cha03.notifyOne;

public class ThreadB extends  Thread{
  private Object lock;

  public ThreadB(Object lock) {
    this.lock = lock;
  }

  @Override
  public void run() {
    Service service = new Service();
    service.testMethod(lock);
  }
}
