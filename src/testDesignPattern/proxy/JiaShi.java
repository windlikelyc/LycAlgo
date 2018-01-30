package testDesignPattern.proxy;

public class JiaShi implements KindWoman {
    @Override
    public void makeEyesWithMan() {
        System.out.println("水汪汪");
    }

    @Override
    public void happyWithMan() {
        System.out.println("甲式");
    }
}
