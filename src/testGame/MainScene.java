package testGame;

/**
 * Created by lyc on 2017/8/23.
 */
public class MainScene {
    public static void main(String[] args) {
        MainRole lyc = new MainRole(300, 100);
        lyc.setWeapon(new Shixiejian());

        int i = 100;
        int lianjitest = 1;
        while (i-- != 0) {
            if (  lyc.pugongWithlianji()) {
                lianjitest++;
            }
        }
        System.out.println((double) lianjitest/100);
    }
}
