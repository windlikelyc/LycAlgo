package testParalle.cha02.synBlockString;

public class ThreadA extends  Thread {
  private Service service;

  public ThreadA(Service service) {
    this.service = service;
  }

  @Override
  public void run() {
    super.run();
    service.setUsernameParamPassword("a","aa");
  }
}
