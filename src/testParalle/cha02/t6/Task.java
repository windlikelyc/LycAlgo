package testParalle.cha02.t6;

public class Task {
  private String getData1;
  private String getData2;

  public  void doLongTimeTask(){
    try {
      System.out.println("begin task");
      Thread.sleep(3000);
      String privategetData1 = "长时间处理任务后远程返回的值 1 threadName = "
          + Thread.currentThread().getName();
      String privategetData2 = "长时间处理任务后远程返回的值 2 threadName = "
          + Thread.currentThread().getName();


      synchronized (this) {
        getData1 = privategetData1;
        getData2 = privategetData2;
      }
      // 以下两个代码不安全，还没来的及打印呢，值就被修改了
      System.out.println(getData1);
      System.out.println(getData2);
      System.out.println("end task");
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }
}
