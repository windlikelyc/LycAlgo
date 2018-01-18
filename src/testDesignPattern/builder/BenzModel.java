package testDesignPattern.builder;

public class BenzModel extends CarModel {

    @Override
    protected void start() {
        System.out.println("hong hong hong...");
    }

    @Override
    protected void stop() {
        System.out.println("ziii za");
    }

    @Override
    protected void alarm() {
        System.out.println("kaa chaaa");
    }

    @Override
    protected void engineBoom() {
        System.out.println("wu wu wu");
    }
}
