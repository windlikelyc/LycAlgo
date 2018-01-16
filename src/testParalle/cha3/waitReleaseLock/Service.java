package testParalle.cha3.waitReleaseLock;

public class Service {
    public void testMethod(Object lock){
        synchronized (lock) {
            try {
                System.out.println("begin notify()");
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("end notify()");
        }

    }
}
