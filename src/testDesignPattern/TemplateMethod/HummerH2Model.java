package testDesignPattern.TemplateMethod;

public class HummerH2Model extends HummerModel {


    @Override
    public void start() {
        System.out.println("H2 starting ..");
    }

    @Override
    public void stop() {
        System.out.println("H2 stops .. ");
    }

    @Override
    public void engineBoom() {
        System.out.println("H2 enging boom..");
    }

    @Override
    public void alarm() {
        System.out.println("H2 du du du..");
    }

    @Override
    protected boolean isAlarm(){
        return false;
    }

}
