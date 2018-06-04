package testParalle.cha04.ConditionTestMethod;


public class RUn {
  public static void main(String[] args) throws InterruptedException {
    MyServicec myServicec = new MyServicec();
    ThreadA a = new ThreadA(myServicec);
    a.setName("a");
    a.start();
    ThreadAA threadAA = new ThreadAA(myServicec);
    threadAA.setName("AA");
    threadAA.start();
    Thread.sleep(1000);
    ThreadB  b= new ThreadB(myServicec);
    b.setName("b");
    b.start();
    ThreadBB bb = new ThreadBB(myServicec);
    bb.setName("bb");
    bb.start();


  }

}
