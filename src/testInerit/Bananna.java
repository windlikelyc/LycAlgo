package testInerit;

/**
 * Created by lyc on 2017/8/22.
 */
public class Bananna extends Fruit {

    private int numofgen;

    @Override
    public void SayName(){
        System.out.println("Ya bananan");
    }


    public Bananna(int weight, String color) {
        super(weight, color);
    }

    public int getNumofgen() {
        return numofgen;
    }

    public void setNumofgen(int numofgen) {
        this.numofgen = numofgen;
    }
}