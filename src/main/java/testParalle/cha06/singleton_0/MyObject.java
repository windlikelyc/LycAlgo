package testParalle.cha06.singleton_0;

public class MyObject {
  private static MyObject myObject = new MyObject();
  private MyObject(){}

  // getInstance 没有进行同步
  public static MyObject getInstance(){
    return myObject;
  }
}
