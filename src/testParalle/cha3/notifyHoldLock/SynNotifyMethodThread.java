package testParalle.cha3.notifyHoldLock;

public class SynNotifyMethodThread extends Thread{
    private Object lock;

    public SynNotifyMethodThread(Object lock) {
        this.lock = lock;
    }

    @Override
    public void run() {

        Service service = new Service();
        service.synNotifyMethod(lock);

    }
}
