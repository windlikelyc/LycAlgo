package testParalle.cha3.waitReleaseLock;

public class Test {
    public static void main(String[] ss) {
        Object lock = new Object();
        ThreadA a = new ThreadA(lock);
        a.start();
        ThreadB b = new ThreadB(lock);
        b.start();
    }
}
