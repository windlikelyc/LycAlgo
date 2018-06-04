package testParalle.cha02.synNoExtends;

public class Main {
  synchronized public void serviceMethod(){
    try {
      System.out.println("int main 下一步 sleep begin threadname="
      +Thread.currentThread().getName() + " time = "
      + System.currentTimeMillis());
      Thread.sleep(5000);
      System.out.println("int main 下一步 sleep end threadname="
          +Thread.currentThread().getName() + " time = "
          + System.currentTimeMillis());
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }
}
