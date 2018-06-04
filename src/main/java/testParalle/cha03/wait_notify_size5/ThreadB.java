package testParalle.cha03.wait_notify_size5;

public class ThreadB extends Thread {
  private Object lock;

  public ThreadB(Object lock) {
    this.lock = lock;
  }

  @Override
  public void run() {
    try {
      synchronized (lock) {
        for(int i = 0;i < 10;i++) {
          MyList.add();
          if (MyList.size() == 5) {
            // notify不立即释放锁
            lock.notify();

            System.out.println("已发出通知");
          }
          System.out.println("已添加"+(i+1)+"而元素");
          Thread.sleep(1000);
        }
      }
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }
}
