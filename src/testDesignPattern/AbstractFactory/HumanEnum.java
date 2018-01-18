package testDesignPattern.AbstractFactory;

public enum HumanEnum {

    YellowMaleHuman("testDesignPattern.AbstractFactory.YellowMaleHuman"),

    YellowFemaleHuman("testDesignPattern.AbstractFactory.YellowFemaleHuman"),

    YellowDoubleHuman("testDesignPattern.AbstractFactory.DoubleYellowHuman"),

    BlackMaleHuman("testDesignPattern.AbstractFactory.BlackMaleHuman"),

    BlackFemaleHuman("testDesignPattern.AbstractFactory.BlackFemaleHuman"),

    BlackDoubleHuman("testDesignPattern.AbstractFactory.DoubleBlackHuman"),

    WhiteMaleHuman("testDesignPattern.AbstractFactory.WhiteMaleHuman"),

    WhiteFemaleHuman("testDesignPattern.AbstractFactory.WhiteFemaleHuman"),

    WhiteDoubleHuman("testDesignPattern.AbstractFactory.DoubleWhiteHuman");

    ;

    private String value = "";

    private HumanEnum(String value) {
        this.value = value;
    }

    public String getValue(){
        return this.value;
    }


}
