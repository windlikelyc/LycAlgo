package testDesignPattern.Strategy;

public class BlockEnermy implements IStrategy {

    @Override
    public void operate() {
        System.out.println("孙夫人断后，挡住追兵");
    }
}
