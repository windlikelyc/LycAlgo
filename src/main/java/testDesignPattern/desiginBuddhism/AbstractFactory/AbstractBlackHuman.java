package testDesignPattern.desiginBuddhism.AbstractFactory;

import java.util.ArrayList;

public abstract class AbstractBlackHuman implements Human {

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
