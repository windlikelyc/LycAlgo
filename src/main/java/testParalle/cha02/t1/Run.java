package testParalle.cha02.t1;

public class Run {
  public static void main(String[] args) {
    HasSelfPrivateNume nume = new HasSelfPrivateNume();
    ThreadA a = new ThreadA(nume);
    a.start();
    ThreadB b = new ThreadB(nume);
    b.start();
  }
}
