package testDesignPattern.designRookie.Singleton;

public class Singleton4 {
  // DCL 双重锁,双重校验

  private volatile static Singleton4 instance;
  private Singleton4(){}

  public static Singleton4 getSingleton4(){
    if (instance == null) {
      synchronized (Singleton4.class) {
        if (instance == null) {
          instance = new Singleton4();
        }
      }
    }
    return instance;
  }
}
