package testInerit;

/**
 * Created by lyc on 2017/8/22.
 */
public class Run {
    public static void main(String[] args) {
        Fruit fruit = new Fruit(3,"red");
        System.out.println(        fruit.getWeight());
        System.out.println(        fruit.getColor());
        Fruit banana = new Bananna(4,"yellow");
        System.out.println(        banana.getColor());
        fruit.SayName();
        banana.SayName();


    }
}
