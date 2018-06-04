package testParalle.javaconcurrent.BQ;

import java.util.concurrent.BlockingQueue;

public class Producer implements Runnable{

    protected BlockingQueue queue = null;

    public Producer(BlockingQueue queue) {
        this.queue = queue;
    }


    @Override
    public void run() {

        try {
            while (true) {
                queue.put("1");
                Thread.sleep(1000);
                queue.put("2");
                Thread.sleep(1000);
                queue.put("3");
            }


        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
