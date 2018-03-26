package algorithm;

import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

/**
 * Created by lyc on 2017/11/7.
 */
public class Reminder {


    Timer timer;

    public Reminder(int seconds) {
        timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                tes();
            }
        }, seconds * 100);
    }

    public static void main(String args[]) {


        System.out.println(1 % 8);

    }

    private static boolean test() {

        try {

            List a = null;
            a.add(3);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("强制执行");
            return false;
        }

    }

    public void tes() {
        System.out.println("asdasd");
        timer.cancel();
    }
}
