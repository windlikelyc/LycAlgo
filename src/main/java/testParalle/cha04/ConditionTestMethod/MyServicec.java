package testParalle.cha04.ConditionTestMethod;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MyServicec {
  private Lock lock = new ReentrantLock();

  public void methodA(){
    try {
      lock.lock();
      System.out.println("methodd A begun ThreaddName = "
      + Thread.currentThread().getName() + " time"
      + System.currentTimeMillis());
      Thread.sleep(5000);
      System.out.println("methodd A end ThreaddName = "
      + Thread.currentThread().getName() + " time"
      + System.currentTimeMillis());
    } catch (InterruptedException e) {
      e.printStackTrace();
    }finally {
      lock.unlock();
    }
  }

  public void methodB(){
    try {
      lock.lock();
      System.out.println("methodd B begun ThreaddName = "
          + Thread.currentThread().getName() + " time"
          + System.currentTimeMillis());
      Thread.sleep(5000);
      System.out.println("methodd B emd ThreaddName = "
          + Thread.currentThread().getName() + " time"
          + System.currentTimeMillis());
    } catch (InterruptedException e) {
      e.printStackTrace();
    }finally {
      lock.unlock();
    }
  }
}
