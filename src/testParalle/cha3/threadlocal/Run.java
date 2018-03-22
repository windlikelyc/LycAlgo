package testParalle.cha3.threadlocal;

public class Run {

    public static void main(String[] args) {
        try {
            ThreadA a = new ThreadA();
            ThreadB b = new ThreadB();
            a.start();
            b.start();
            for (int i = 0; i < 100; i++) {
                Tools.t1.set("Main" + (i + 1));
                System.out.println("Main get VAlue =" + Tools.t1.get());
                Thread.sleep(200);

            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
