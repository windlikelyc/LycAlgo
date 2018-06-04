package testParalle.cha02.synchronizedOneThreadIn;

public class ThreadA extends Thread {
  private ObjectService objectService;

  public ThreadA(ObjectService objectService) {
    this.objectService = objectService;
  }

  @Override
  public void run() {
    super.run();
    objectService.serviceMethod();
  }
}
