package testParalle.cha01.isaliveOther;

public class CountOperate extends Thread{
  public CountOperate(){
    System.out.println("COuntopeate----begin");
    System.out.println("currth==" + Thread.currentThread().getName());
    System.out.println("curisalive==" + Thread.currentThread().isAlive());
    System.out.println("tname==" + this.getName());
    System.out.println("thisisalive==" + this.isAlive());
    System.out.println("Counta----------end");
  }

  @Override
  public void run() {
    super.run();
    System.out.println("run----begin");
    System.out.println("currth==" + Thread.currentThread().getName());
    System.out.println("curisalive==" + Thread.currentThread().isAlive());
    System.out.println("tname==" + this.getName());
    System.out.println("thisisalive==" + this.isAlive());
    System.out.println("run----------end");
  }
}
