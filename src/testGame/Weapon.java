package testGame;

/**
 * Created by lyc on 2017/8/23.
 */
public abstract class Weapon   {

    String name;



    private int attack;
    private int manaattack;

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getManaattack() {
        return manaattack;
    }





    public void setManaattack(int manaattack) {
        this.manaattack = manaattack;
    }

    public abstract void selftexiao(MainRole mainRole);

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Weapon(String name, int attack, int manaattack) {
        this.name = name;
        this.attack = attack;
        this.manaattack = manaattack;
    }
}
