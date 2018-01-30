package testDesignPattern.Singleton;

public class SingletonPattern {
    private static final SingletonPattern sin = new SingletonPattern();

    private SingletonPattern(){}

    public synchronized static SingletonPattern getInstance(){
        return sin;
    }
}
