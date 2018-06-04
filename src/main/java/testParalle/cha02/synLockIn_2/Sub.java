package testParalle.cha02.synLockIn_2;

public class Sub extends  Main {
  synchronized public void opearteISubMethod(){
    try {
      while (i > 0) {
        i--;
        System.out.println("sub print i = " + i);
        Thread.sleep(100);

        this.operateMainMethod();
      }
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }

  // 子类用可重入锁调用父类方法
}
