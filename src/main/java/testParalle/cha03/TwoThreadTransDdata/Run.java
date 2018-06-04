package testParalle.cha03.TwoThreadTransDdata;

public class Run {
  public static void main(String[] args) {
    MyList service = new MyList();
    Thread a = new ThreadA(service);
    a.setName("a");
    a.start();
    Thread b = new ThreadB(service);
    b.setName("b");
    b.start();

  }
}
