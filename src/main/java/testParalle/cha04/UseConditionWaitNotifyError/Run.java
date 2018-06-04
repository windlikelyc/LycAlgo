package testParalle.cha04.UseConditionWaitNotifyError;

public class Run {

  public static void main(String[] args) {
    MyService myService = new MyService();
    ThreadA a = new ThreadA(myService);
    a.start();
  }
}
