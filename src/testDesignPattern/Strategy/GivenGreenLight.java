package testDesignPattern.Strategy;

public class GivenGreenLight implements IStrategy{


    @Override
    public void operate() {
        System.out.println("求国太开绿灯");
    }
}
