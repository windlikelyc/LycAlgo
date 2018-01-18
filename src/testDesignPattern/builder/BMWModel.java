package testDesignPattern.builder;

public class BMWModel extends CarModel {

    @Override
    protected void start() {
        System.out.println("tua tua tua...");
    }

    @Override
    protected void stop() {
        System.out.println("iiii ");
    }

    @Override
    protected void alarm() {
        System.out.println("zizizi");
    }

    @Override
    protected void engineBoom() {
        System.out.println("kkloaok");
    }
}
