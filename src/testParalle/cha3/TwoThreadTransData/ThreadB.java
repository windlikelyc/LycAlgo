package testParalle.cha3.TwoThreadTransData;

public class ThreadB extends Thread {
    private MyList list;

    public ThreadB(MyList list) {
        super();
        this.list = list;
    }

    @Override
    public void run() {
        try {
                while (true) {
                if (list.size() == 5) {
                    System.out.println("==5了，县城b要退出了！");
                    throw new InterruptedException();
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
