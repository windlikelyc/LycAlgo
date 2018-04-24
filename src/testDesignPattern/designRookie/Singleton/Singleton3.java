package testDesignPattern.designRookie.Singleton;

public class Singleton3 {
  // 饿汉式,现存安全

  private static Singleton3 instance = new Singleton3();
  private Singleton3(){}

  public static Singleton3 getInstance() {
    return instance;
  }
}
