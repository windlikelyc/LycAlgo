package testParalle.cha03.TwoThreadTransDdata;

public class ThreadB extends Thread {

  private MyList myList;

  public ThreadB(MyList myList) {
    this.myList = myList;
  }

  @Override
  public void run() {
    try {
      // 真他吗见鬼了，死活看不到size等于5的时候
//        System.out.println(myList.size()+"wocao");
      while (true) {
        // 强制读内存，因为jdk8只支持server模式，所以每次都读本地方法栈
        // 的list变量，故每次都是0
//        synchronized (this){}
        if (myList.size() == 5) {
          System.out.println("==5乐，我要推出");
          throw new InterruptedException();
        }
      }
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }
}
