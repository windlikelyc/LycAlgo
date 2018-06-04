package testNetty.cha02.TimeServerPoll;


import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class TimeServerHandlerExecutePook {

  private ExecutorService executor;

  public TimeServerHandlerExecutePook(int maxPoolSize , int quequeSieze) {
    executor = new ThreadPoolExecutor(Runtime.getRuntime().availableProcessors()
        , maxPoolSize, 120L, TimeUnit.SECONDS,
        new ArrayBlockingQueue<Runnable>(quequeSieze));
  }

  public void execute(Runnable task) {
    executor.execute(task);
  }
}
