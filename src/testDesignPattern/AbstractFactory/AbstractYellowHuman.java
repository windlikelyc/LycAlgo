package testDesignPattern.AbstractFactory;

public abstract class AbstractYellowHuman implements Human{

    @Override
    public void laugh() {
        System.out.println("hehehe");
    }

    @Override
    public void cry() {
        System.out.println("wewewe");
    }

    @Override
    public void talk() {
        System.out.println("gegege");

    }
}
