package testDesignPattern.AbstractFactory;

public class NvWa {

    public static void main(String[] args){

        HumanFactory maleHumanFactory = new MaleHumanFactory();

        HumanFactory femaleHumanFactory = new FemaleHumanFactory();

        Human maleYellowHuman = maleHumanFactory.createYellowHuman();

        Human femaleYellowHuman = femaleHumanFactory.createYellowHuman();

        maleYellowHuman.cry();

        maleYellowHuman.laugh();

        femaleYellowHuman.sex();

        HumanFactory doubleHumanFactory = new DoubleHumanFactory();

        Human awhitebiantai = doubleHumanFactory.createWhiteHuman();

        awhitebiantai.sex();

        awhitebiantai.laugh();

        Human ayeelowbiantain = doubleHumanFactory.createYellowHuman();

        ayeelowbiantain.sex();

        ayeelowbiantain.talk();

    }

}
