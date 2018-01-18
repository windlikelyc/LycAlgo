package testDesignPattern.factory;

public class BlackHuman implements Human {
    @Override
    public void laugh() {
        System.out.println("hohoho");
    }

    @Override
    public void cry() {
        System.out.println("wowowo");
    }

    @Override
    public void talk() {
        System.out.println("gogogo");

    }
}

