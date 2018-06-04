package testParalle.cha02.synchronizedMethodLockObject;

public class Run {
  public static void main(String[] args) {
    MyObject myObject = new MyObject();
    ThreadA a = new ThreadA(myObject);
    a.setName("a");
    ThreadB b = new ThreadB(myObject);
    b.setName("b");
    a.start();
    b.start();

  }
}
