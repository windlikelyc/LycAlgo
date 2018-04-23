package testParalle.cha02.t7;

public class Task {
  public void doLongTimeTask() {
    for (int i = 0; i < 100; i++) {
      System.out.println(
          "nonono threadName = "
              + Thread.currentThread().getName() +
              "i= " + i
      );
    }
    System.out.println("");
    synchronized (this) {
      for (int i = 0; i < 100; i++) {
        System.out.println(
            "yeyeye threadName = "
                + Thread.currentThread().getName() +
                "i= " + i
        );
      }
    }
  }
}
