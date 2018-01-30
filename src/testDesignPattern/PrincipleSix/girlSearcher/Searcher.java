package testDesignPattern.PrincipleSix.girlSearcher;

public class Searcher extends AbstactSearcher {
    public Searcher(IGreatTemperatureGirl _greatTemperatureGirl) {
        super(_greatTemperatureGirl);
    }

    public Searcher(IGoodBodyGirl _goodBodyGirl) {
        super(_goodBodyGirl);
    }

    @Override
    void show() {
        if(super.goodBodyGirl!=null){
            super.goodBodyGirl.goodLooking();
            super.goodBodyGirl.niceFigure();
        }

        if (super.greatTemperatureGirl != null) {
            super.greatTemperatureGirl.greatTemperature();
        }
    }
}
