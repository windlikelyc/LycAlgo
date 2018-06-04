package testParalle.cha01.t7;

public class Run {
  public static void main(String[] args)throws InterruptedException {
    MyThread myThread = new MyThread();
    System.out.println("begin=="+myThread.isAlive());
    myThread.start();
    Thread.sleep(100);

    System.out.println("end == " + myThread.isAlive());


  }
}
