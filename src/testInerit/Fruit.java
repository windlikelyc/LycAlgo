package testInerit;

/**
 * Created by lyc on 2017/8/22.
 */
public class Fruit {
    private int weight;
    private String color;

    public void SayName(){
        System.out.print("This is a Frit");
    }

    public Fruit(int weight, String color) {
        this.weight = weight;
        this.color = color;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
