package testParalle.cha01;

public class Run {
  public static void main(String[] args) {
    CountOperate c = new CountOperate();
    Thread t1 = new Thread(c);
    t1.setName("aaaaaaaaaaa");
    t1.start();
  }
}
