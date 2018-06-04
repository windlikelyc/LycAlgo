package testParalle.cha02.twoObjectTwoLock;

public class Run {
  public static void main(String[] args) {
    HasSelfPrivateNum numRef1 = new HasSelfPrivateNum();
    HasSelfPrivateNum numRef2 = new HasSelfPrivateNum();
    ThreadA a = new ThreadA(numRef1);
    a.start();
    ThreadB b = new ThreadB(numRef2);
    b.start();
  }
}
