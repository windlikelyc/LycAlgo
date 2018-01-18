package testDesignPattern.AbstractFactory;

public class WhiteMaleHuman extends AbstractWhiteHuman {

    @Override
    public void sex() {
        System.out.println("This is a white man");
    }
}
