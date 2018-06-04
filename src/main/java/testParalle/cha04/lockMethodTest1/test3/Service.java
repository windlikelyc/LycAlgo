package testParalle.cha04.lockMethodTest1.test3;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class Service {
  private ReentrantLock lock = new ReentrantLock();
  private Condition newCondition = lock.newCondition();
  public void waitMethod(){
    try {
      lock.lock();
      newCondition.await();
    } catch (InterruptedException e) {
      e.printStackTrace();
    }finally {
      lock.unlock();
    }
  }

  public void notifyMethod(){
    try {
      lock.lock();
      // 返回等待此锁相关的给定条件的线程估计数
      System.out.println("有" + lock.getWaitQueueLength(newCondition)
      +"个线程在等待newCondition");
    }finally {
      lock.unlock();

    }
  }
}
