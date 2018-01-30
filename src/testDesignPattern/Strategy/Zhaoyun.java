package testDesignPattern.Strategy;

public class Zhaoyun {

    public static void main(String[] args) {
        Context context;
        context = new Context(new BackDoor());
        context.operate();


        context = new Context(new GivenGreenLight());
        context.operate();

        context = new Context(new BlockEnermy());
        context.operate();

    }
}
