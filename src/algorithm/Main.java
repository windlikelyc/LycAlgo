package algorithm;

import java.util.*;

/**
 * Created by lyc on 2017/9/6.
 */

/**
 */
public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        System.out.println(helper(s));
    }

    public static String helper(String s) {
        int len = s.length();
        int Sqrt = (int) Math.sqrt(len);
        for(int i = Sqrt;i>=1;i--) {
            if (len % i == 0) {
                String str = s.substring(0, i);
                String strlen = "";
                for(int j = 0;j<len/i;j++) {
                    strlen = strlen + str;
                }
                if (s.equals(strlen)) {
                    return str;
                }
            }
        }
        return "false";
    }



}
