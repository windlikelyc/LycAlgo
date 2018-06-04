package testParalle.cha05.timerTest1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class Run2 {
  private static Timer timer = new Timer();

  public static class MyTask1 extends TimerTask {
    @Override
    public void run() {
      System.out.println("运行了！时间为"+new Date());
      try {
        Thread.sleep(20000);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
  }

  public static class MyTask2 extends TimerTask{

    @Override
    public void run() {
      System.out.println("运行了！时间为"+new Date());
    }
  }

  public static void main(String[] args) {
    try {
      MyTask1 task1 = new MyTask1();
      MyTask2 task2 = new MyTask2();
      SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
      String dateString = "2018-04-24 21:05:00";
      Date dateRef = sdf.parse(dateString);

      SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
      String dateString2 = "2018-04-24 21:05:10";
      Date dateRef2 = sdf.parse(dateString2);

      System.out.println("字符串时间"+dateRef.toLocaleString()+"当前时间："+new Date().toLocaleString());
      System.out.println("字符串时间"+dateRef2.toLocaleString()+"当前时间："+new Date().toLocaleString());

      timer.schedule(task1,dateRef);
      timer.schedule(task2,dateRef2);


    } catch (ParseException e) {
      e.printStackTrace();
    }
  }
}
