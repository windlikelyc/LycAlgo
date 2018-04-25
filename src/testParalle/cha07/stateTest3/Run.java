package testParalle.cha07.stateTest3;

public class Run {

  public static void main(String[] args) throws InterruptedException {
    MyThread1 t1 = new MyThread1();
    t1.setName("a");
    t1.start();

    MyThread2 t2 = new MyThread2();
    t2.setName("b");
    t2.start();
    // 没有这句话就没法出现BLOCK原因是t2启动的瞬间得到Runnabel，这时候还没来得及去和
    // a抢锁，或了0.1秒后才开始抢锁,发现没抢到，于是BLOCK自己

    Thread.sleep(100);
    System.out.println("main 方法中的t2状态" + t2.getState());
  }
}
