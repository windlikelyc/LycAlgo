package testDesignPattern.Singleton;

public class Minister {

    public static void main(String[] args) {
        Emperor emperor1 = Emperor.getInstance();
        emperor1.emperInfo();

        Emperor emperor2 = Emperor.getInstance();
        emperor2.emperInfo();

        Emperor emperor3 = Emperor.getInstance();
        emperor3.emperInfo();

    }
}
