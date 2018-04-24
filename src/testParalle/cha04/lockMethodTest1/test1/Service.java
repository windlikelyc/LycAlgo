package testParalle.cha04.lockMethodTest1.test1;

import java.util.concurrent.locks.ReentrantLock;

public class Service {
  private ReentrantLock lock = new ReentrantLock();
  public void serviceMethod(){
    try {
      lock.lock();
      //当前线程保持此锁定的个数
      System.out.println("servicemethdo getHoldCount="
          + lock.getHoldCount());
      serviceMethod2();
    }finally {
      lock.unlock();
    }
  }

  private void serviceMethod2() {
    try {
      lock.lock();
      System.out.println("serviceMethdo2 getHoldCount = " +
      lock.getHoldCount());
    }finally {
      lock.unlock();
    }
  }
}
