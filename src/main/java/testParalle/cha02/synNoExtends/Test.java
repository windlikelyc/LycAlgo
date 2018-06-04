package testParalle.cha02.synNoExtends;

public class Test {

  public static void main(String[] args) {
    Sub sub = new Sub();
    ThreadA a = new ThreadA(sub);
    a.setName("a");
    a.start();

    ThreadB b = new ThreadB(sub);b.setName("B");
    b.start();


  }
}
