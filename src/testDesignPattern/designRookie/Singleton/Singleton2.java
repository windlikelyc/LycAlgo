package testDesignPattern.designRookie.Singleton;

public class Singleton2 {
  // 懒汉式,县城安全

  private static Singleton2 instance;
  private Singleton2(){}

  public static synchronized Singleton2 getInstance(){
    if(instance == null)
      return new Singleton2();
    return instance;
  }

}
