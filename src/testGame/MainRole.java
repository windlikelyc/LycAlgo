package testGame;

import java.util.Random;

/**
 * Created by lyc on 2017/8/23.
 */
public class MainRole {


    private Weapon weapon;

    private int maxhp;
    private int currenthp;
    private int maxmp;
    private int currentmp;

    private int strength = 0;
    private int intelligence = 0;

    private double baoji = 0.5;
    private double baojixiaoguo = 1.5;
    private double lianji = 0.2;


    private int attack = 10;
    private int manaattack = 0;
    private double additionalattack = 0;



    private int physicaldefence = 0;
    private int manadefence = 0;

    private boolean isdead = false;
    private boolean isSliece = false;
    private boolean isDizz = false;

    /**
     *
     * @param maxhp  最大生命
     * @param maxmp     最大魔法
     */
    public MainRole(int maxhp, int maxmp ) {
        this.maxhp = maxhp;
        this.maxmp = maxmp;
        setCurrenthp(maxhp);
        setCurrentmp(maxmp);
    }

    public boolean pugongWithlianji(){
        Random random = new Random();
        if (lianji > random.nextDouble()) {
            System.out.println("连击！！！");


            System.out.println( shuchu());
            System.out.println( shuchu());
            return true;
        }else {
            System.out.println("普攻");
            System.out.println( shuchu());
            return false;
        }
    }

    private double shuchu() {
        Random random = new Random();
        double damage;
        if (baoji > random.nextDouble()) {
           damage =  (int)(attack*baojixiaoguo);
            damage *= (1 + additionalattack);
            return damage;
        } else {
            damage = attack;
           damage *= (1 + additionalattack);
            return damage;
        }


    }

    public int getMaxhp() {
        return maxhp;
    }

    public void setMaxhp(int maxhp) {
        this.maxhp = maxhp;
    }

    public int getCurrenthp() {
        return currenthp;
    }

    public void setCurrenthp(int currenthp) {
        this.currenthp = currenthp;
    }

    public int getMaxmp() {
        return maxmp;
    }

    public void setMaxmp(int maxmp) {
        this.maxmp = maxmp;
    }

    public int getCurrentmp() {
        return currentmp;
    }

    public void setCurrentmp(int currentmp) {
        this.currentmp = currentmp;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    public double getBaoji() {
        return baoji;
    }

    public void setBaoji(double baoji) {
        this.baoji = baoji;
    }

    public double getLianji() {
        return lianji;
    }

    public void setLianji(double lianji) {
        this.lianji = lianji;
    }

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

    public int getPhysicaldefence() {
        return physicaldefence;
    }

    public void setPhysicaldefence(int physicaldefence) {
        this.physicaldefence = physicaldefence;
    }

    public int getManadefence() {
        return manadefence;
    }

    public void setManadefence(int manadefence) {
        this.manadefence = manadefence;
    }

    public boolean isdead() {
        return isdead;
    }

    public void setIsdead(boolean isdead) {
        this.isdead = isdead;
    }

    public boolean isSliece() {
        return isSliece;
    }

    public void setSliece(boolean sliece) {
        isSliece = sliece;
    }

    public boolean isDizz() {
        return isDizz;
    }

    public void setDizz(boolean dizz) {
        isDizz = dizz;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
        setAttack(attack + weapon.getAttack());
        setManaattack(manadefence + weapon.getManaattack());
        weapon.selftexiao(this);
    }

    public double getBaojixiaoguo() {
        return baojixiaoguo;
    }

    public void setBaojixiaoguo(double baojixiaoguo) {
        this.baojixiaoguo = baojixiaoguo;
    }

    public double getAdditionalattack() {
        return additionalattack;
    }

    public void setAdditionalattack(double additionalattack) {
        this.additionalattack = additionalattack;
    }




}
