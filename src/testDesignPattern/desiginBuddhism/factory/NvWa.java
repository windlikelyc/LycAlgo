package testDesignPattern.desiginBuddhism.factory;


public class NvWa {

    public static void main(String[] args) {

        System.out.println("creating white person..");
        Human whiteHuman = HumanFactory.createHuman(WhiteHuman.class);
        whiteHuman.cry();
        whiteHuman.laugh();
        whiteHuman.talk();

        System.out.println("creating black person..");
        Human blackHuman = HumanFactory.createHuman(BlackHuman.class);
        blackHuman.cry();
        blackHuman.laugh();
        blackHuman.talk();

        System.out.println("creating yellow person..");
        Human yellowHuman = HumanFactory.createHuman(YellowHuman.class);
        yellowHuman.cry();
        yellowHuman.laugh();
        yellowHuman.talk();

        //测试新加入的工厂的一种人类
        System.out.println("creating yellow person..");
        Human lycHuman = HumanFactory.createHuman(LycHuman.class);
        yellowHuman.cry();
        yellowHuman.laugh();
        yellowHuman.talk();

        for (int i=0;i<1000000000;i++) {
            System.out.println("creating 10 yi ren");
            Human human = HumanFactory.createHuman();
            human.cry();
            human.laugh();
            human.talk();

        }

    }
}
