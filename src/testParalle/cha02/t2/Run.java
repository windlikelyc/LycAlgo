package testParalle.cha02.t2;

public class Run {
  public static void main(String[] args) {
    HasSelfPrivateNum nume = new HasSelfPrivateNum();
    ThreadA a = new ThreadA(nume);
    a.start();
    ThreadB b = new ThreadB(nume);
    b.start();
  }
}
