package testParalle.cha02.doubleSynBlockOneTwo;

public class Run {
  public static void main(String[] args) {
    ObjectService objectService = new ObjectService();
    ThreadA a = new ThreadA(objectService);
    a.setName("a");
    a.start();
    ThreadB b = new ThreadB(objectService);
    b.setName("b");
    b.start();
  }
}
