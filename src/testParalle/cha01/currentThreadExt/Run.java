package testParalle.cha01.currentThreadExt;

public class Run {

  public static void main(String[] args) {
    CountOperation c = new CountOperation();
    Thread t1 = new Thread(c);
    t1.setName("A");
    t1.start();
    System.out.println(t1==c);

  }
}
