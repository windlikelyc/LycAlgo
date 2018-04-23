package testParalle.cha02.t16;

public class RunThread extends  Thread{
  // 强制从主内存中读取
  private volatile boolean isRunning = true;


  public boolean isRunning() {
    return isRunning;
  }

  public void setRunning(boolean running) {
    isRunning = running;
  }

  @Override
  public void run() {
    System.out.println("进入到run乐");
    while (isRunning == true){}
    System.out.println("县城停止了");
  }
}
