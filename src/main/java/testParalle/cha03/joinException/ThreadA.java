package testParalle.cha03.joinException;

public class ThreadA extends Thread {

  @Override
  public void run() {
      for(int i = 0 ; i < Integer.MAX_VALUE ; i++) {
        String newstring = new String();
        Math.random();
      }
  }
}
