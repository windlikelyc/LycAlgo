package testParalle.cha02.synchronizedUpdateNewValue;

public class Run {
  public static void main(String[] args) {

    try {
      Service service = new Service();
      new ThreadA(service).start();
      Thread.sleep(2000);
      new ThreadB(service).start();


    } catch (InterruptedException e) {
      e.printStackTrace();
    }

  }
}
