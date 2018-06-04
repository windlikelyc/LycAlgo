package testParalle.cha02.AtomicIntegerTest;

public class Run {
  public static void main(String[] args) {
    AddCountThread countService = new AddCountThread();
    new Thread(countService).start();
    new Thread(countService).start();
    new Thread(countService).start();
    new Thread(countService).start();
    new Thread(countService).start();
    new Thread(countService).start();

  }
}
