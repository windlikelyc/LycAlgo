package testDesignPattern.designRookie.Singleton;

public class Singleton1 {
  // 懒汉式,线程不安全
  private static Singleton1 instance;

  private Singleton1 (){}

  public static Singleton1 getInstance(){
    if (instance == null) {
      return new Singleton1();
    }
    return instance;
  }
}
