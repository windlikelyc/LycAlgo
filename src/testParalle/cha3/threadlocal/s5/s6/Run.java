package testParalle.cha3.threadlocal.s5.s6;

public class Run {

    public static ThreadLocalExt t1 = new ThreadLocalExt();

    public static void main(String[] args) {
        if (t1.get() == null) {
            System.out.println("woca o");
        }
        System.out.println(t1.get());
        System.out.println(t1.get());

    }
}
