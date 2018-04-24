package testDesignPattern.desiginBuddhism.factory;

public class WhiteHuman implements Human {
    @Override
    public void laugh() {
        System.out.println("hihihi");
    }

    @Override
    public void cry() {
        System.out.println("wiwiwi");
    }

    @Override
    public void talk() {
        System.out.println("gigigi");

    }
}

