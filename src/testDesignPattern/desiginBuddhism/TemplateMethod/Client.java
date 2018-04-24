package testDesignPattern.desiginBuddhism.TemplateMethod;

public class Client {

    public static void main(String[] args){
//        HummerModel h1 = new HummerH1Model();
//        h1.setAlarmFlag(false);
//        h1.run();

        HummerModel h2 = new HummerH2Model();
        h2.setAlarmFlag(true);
        h2.run();

    }
}
