package testDesignPattern.PrincipleSix.CS;

public class Client {

    public static void main(String[] args) {
        Soldier soldier = new Soldier();
        soldier.killEnermy(new Rifle());
    }
}
