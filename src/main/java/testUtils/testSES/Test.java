package testUtils.testSES;

import testParalle.cha01.Run;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.LongAdder;

public class Test {

    public static void main(String[] args) {
        ScheduledExecutorService executor = Executors.newScheduledThreadPool(1);
        executor.scheduleAtFixedRate(new EchoServer(), 0, 100, TimeUnit.MILLISECONDS);
    }

}


/**
 * 这是一个类
 */
class EchoServer implements Runnable {

    private int i = 0;
    @Override
    public void run() {
        System.out.println(i++);
    }
}