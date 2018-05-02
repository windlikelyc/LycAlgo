package testParalle.cha03.p_r_test;

public class Run {

  public static void main(String[] args) {
    String lock = new String("");
    P p = new P(lock);
    C c = new C(lock);

    new ThreadC(c).start();
    new ThreadP(p).start();
  }
}
