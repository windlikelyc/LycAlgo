package testDesignPattern.desiginBuddhism.PrincipleSix.girlSearcher;

public abstract class AbstactSearcher {
    protected  IGreatTemperatureGirl greatTemperatureGirl;
    protected IGoodBodyGirl goodBodyGirl;
    public AbstactSearcher(IGreatTemperatureGirl _greatTemperatureGirl) {
        this.greatTemperatureGirl = _greatTemperatureGirl;

    }

    public AbstactSearcher(IGoodBodyGirl _goodBodyGirl) {
        this.goodBodyGirl = _goodBodyGirl;
    }

    abstract void show();

}
