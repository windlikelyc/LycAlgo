package testGame;

/**
 * Created by lyc on 2017/8/23.
 */
public class Shixiejian extends Weapon {
    public Shixiejian() {
        super("嗜血剑", 60, 30);
    }

    @Override
    public void selftexiao(MainRole mainRole) {
        mainRole.setAdditionalattack(mainRole.getAdditionalattack()+ 0.1);
    }
}
