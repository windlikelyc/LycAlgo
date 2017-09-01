package testGame;

/**
 * Created by lyc on 2017/8/23.
 */
public class Kongmengjian extends Weapon {

    private double baoji = 0.3;


    public double getBaoji() {
        return baoji;
    }

    public Kongmengjian() {
        super("空梦剑",100, 30);
    }


    @Override
    public void selftexiao(MainRole mainRole) {
        mainRole.setBaoji(mainRole.getBaoji()+baoji);
    }
}
