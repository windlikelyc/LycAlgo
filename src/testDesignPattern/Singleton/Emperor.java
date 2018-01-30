package testDesignPattern.Singleton;

public class Emperor {

    private static Emperor emperor = null;

    private Emperor(){}

    public static Emperor getInstance(){
        if (emperor == null) {
            emperor = new Emperor();
        }
        return emperor;
    }

    public static void emperInfo(){
        System.out.println("我叫皇帝某某某");
    }
}
