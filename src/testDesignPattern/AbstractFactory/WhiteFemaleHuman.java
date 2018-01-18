package testDesignPattern.AbstractFactory;

public class WhiteFemaleHuman extends AbstractWhiteHuman {

    @Override
    public void sex() {
        System.out.println("This is a white woman");
    }
}
