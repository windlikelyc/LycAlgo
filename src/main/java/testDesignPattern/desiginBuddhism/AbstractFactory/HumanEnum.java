package testDesignPattern.desiginBuddhism.AbstractFactory;

public enum HumanEnum {

    YellowMaleHuman("testDesignPattern.desiginBuddhism.AbstractFactory.YellowMaleHuman"),

    YellowFemaleHuman("testDesignPattern.desiginBuddhism.AbstractFactory.YellowFemaleHuman"),

    YellowDoubleHuman("testDesignPattern.desiginBuddhism.AbstractFactory.DoubleYellowHuman"),

    BlackMaleHuman("testDesignPattern.desiginBuddhism.AbstractFactory.BlackMaleHuman"),

    BlackFemaleHuman("testDesignPattern.desiginBuddhism.AbstractFactory.BlackFemaleHuman"),

    BlackDoubleHuman("testDesignPattern.desiginBuddhism.AbstractFactory.DoubleBlackHuman"),

    WhiteMaleHuman("testDesignPattern.desiginBuddhism.AbstractFactory.WhiteMaleHuman"),

    WhiteFemaleHuman("testDesignPattern.desiginBuddhism.AbstractFactory.WhiteFemaleHuman"),

    WhiteDoubleHuman("testDesignPattern.desiginBuddhism.AbstractFactory.DoubleWhiteHuman");

    ;

    private String value = "";

    private HumanEnum(String value) {
        this.value = value;
    }

    public String getValue(){
        return this.value;
    }


}
