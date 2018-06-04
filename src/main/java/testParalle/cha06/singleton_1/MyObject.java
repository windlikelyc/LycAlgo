package testParalle.cha06.singleton_1;

public class MyObject {
  private static MyObject myObject;
  private MyObject(){}

  synchronized public static MyObject getInstance() throws InterruptedException {
    if (myObject != null) {
      ;
    }else {
      Thread.sleep(3000);
      myObject = new MyObject();
    }
    return myObject;
  }
}
