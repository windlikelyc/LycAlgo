package testDesignPattern.AbstractFactory;

public enum HumanEnum {

    YellowMaleHuman("testDesignPattern.AbstractFactory.YellowMaleHuman"),

    YellowFemaleHuman("testDesignPattern.AbstractFactory.YellowFemaleHuman"),

    BlackMaleHuman("testDesignPattern.AbstractFactory.BlackMaleHuman"),

    BlackFemaleHuman("testDesignPattern.AbstractFactory.BlackFemaleHuman"),

    WhiteMaleHuman("testDesignPattern.AbstractFactory.WhiteMaleHuman"),

    WhiteFemaleHuman("testDesignPattern.AbstractFactory.WhiteFemaleHuman");

    private String value = "";

    private HumanEnum(String value) {
        this.value = value;
    }

    public String getValue(){
        return this.value;
    }


}
