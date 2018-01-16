package testParalle.cha3.wait_notify_size5;

public class Run {
    public static void main(String[] arsgs) {
        try {
            Object lock = new Object();
            ThreadA a = new ThreadA(lock);
            a.start();
            Thread.sleep(500);
            ThreadB b = new ThreadB(lock);
            b.start();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
