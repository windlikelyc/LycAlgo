package testDesignPattern.factory;

/**
 *   测试工厂模式，往工厂里添加一个新兴人类，他的名字叫刘耀晨人
 */
public class LycHuman implements Human{
    @Override
    public void laugh() {
        System.out.println("人活着就要开心的笑");
    }

    @Override
    public void cry() {
        System.out.println("生下来就不会哭");

    }

    @Override
    public void talk() {
        System.out.println("走自己的路");

    }
}
