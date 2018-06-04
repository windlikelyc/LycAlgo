package testParalle.cha01.t7;

public class MyThread extends Thread {

  @Override
  public void run() {
    System.out.println("run == " + this.isAlive());
  }

}
