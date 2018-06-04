package testParalle.cha03.InheritableThreadLocal;

public class Run {
  public static void main(String[] args) {
    try {
      for(int i = 0 ; i < 10 ;i++) {
        System.out.println("在Main中取值=" + Tools.t1.get());
        Thread.sleep(100);
      }
      Thread.sleep(5000);
      ThreadA a = new ThreadA();
      a.start();
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }
}
