package testParalle.javaconcurrent.BQ;

import java.util.concurrent.BlockingQueue;

public class Consumer implements Runnable{

    protected BlockingQueue queue = null;

    public Consumer(BlockingQueue queue) {
        this.queue = queue;
    }

    @Override
    public void run() {

        try {
            while (true) {
                System.out.println(queue.take());
                String a = "aa";
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
