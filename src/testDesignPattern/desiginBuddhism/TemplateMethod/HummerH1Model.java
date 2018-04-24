package testDesignPattern.desiginBuddhism.TemplateMethod;

public class HummerH1Model extends HummerModel {


    @Override
    public void start() {
        System.out.println("H1 starting ..");
    }

    @Override
    public void stop() {
        System.out.println("H1 stops .. ");
    }

    @Override
    public void engineBoom() {
        System.out.println("H1 enging boom..");
    }

    @Override
    public void alarm() {
        System.out.println("H1 du du du..");
    }

}
