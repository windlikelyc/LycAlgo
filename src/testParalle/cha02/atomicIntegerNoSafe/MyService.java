package testParalle.cha02.atomicIntegerNoSafe;

import java.util.concurrent.atomic.AtomicLong;

public class MyService {
  public static AtomicLong aiRef = new AtomicLong();
  synchronized public void addNum(){
    System.out.println(Thread.currentThread().getName() + "加了100之后的数是" +
        aiRef.addAndGet(100));
    aiRef.addAndGet(1);
  }
}
