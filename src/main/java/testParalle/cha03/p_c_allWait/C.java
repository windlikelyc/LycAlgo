package testParalle.cha03.p_c_allWait;

public class C  {
  private String lock;

  public C(String lock) {
    this.lock = lock;
  }

  public void getValue(){
    try {
      synchronized (lock) {
        while (ValueObject.value.equals("")) {
          System.out.println("消费者" + Thread.currentThread().getName()
              +" WATING 了 攼");
          lock.wait();
        }
        System.out.println("消费者" + Thread.currentThread().getName()
            +" Runnable了");
        ValueObject.value = "";
        lock.notify();
      }
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }
}
