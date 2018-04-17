package testParalle.innerclass;

public class Main {

    public static void main(String[] args) {
        Main m = new Main();
        m.test(1021);

    }

    public void test( int b) {

         int a = 10;
        new Thread(){
            @Override
            public void run() {
                System.out.println(a);
                System.out.println(b);
            }
        }.start();

    }
}
