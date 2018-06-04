package testDesignPattern.desiginBuddhism.PrincipleSix.girlSearcher;

public class PrettyGirl implements IGoodBodyGirl,IGreatTemperatureGirl{

    private String name;

    public PrettyGirl(String name) {
        this.name = name;
    }


    @Override
    public void goodLooking() {
        System.out.println(this.name+"henhaokan");
    }

    @Override
    public void niceFigure() {
        System.out.println(this.name+"is hot");

    }

    @Override
    public void greatTemperature() {
        System.out.println(this.name+"has good temper");
    }
}
