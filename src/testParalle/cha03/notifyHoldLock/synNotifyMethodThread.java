package testParalle.cha03.notifyHoldLock;

public class synNotifyMethodThread extends Thread {
  private Object object;

  public synNotifyMethodThread(Object object) {
    this.object = object;
  }

  @Override
  public void run() {
    Service service = new Service();
    service.synNotifyMethod(object);
  }
}
