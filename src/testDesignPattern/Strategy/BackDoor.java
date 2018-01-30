package testDesignPattern.Strategy;

public class BackDoor implements IStrategy {

    @Override
    public void operate() {
        System.out.println("找乔国佬");
    }
}
