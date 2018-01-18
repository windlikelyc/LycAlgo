package testDesignPattern.AbstractFactory;


public class DoubleYellowHuman extends AbstractYellowHuman {

    @Override
    public void sex() {
        System.out.println("生男生女都一样");
    }

}
