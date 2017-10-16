package LycAlgo.Atcode.Septem9;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by lyc on 2017/10/12.
 */
public class Main {
    public static void main(String[] strings) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        if (input.length() == 1) System.out.print(1);
        List<Integer> list = new ArrayList<>();
        int now = 1;
        for (int i = 1; i < input.length(); i++) {
            if (input.charAt(i) != input.charAt(i - 1)) {
                list.add(now);
                now = 1;
            } else {
                now++;
            }
        }
        list.add(now);
        int total = 0;
        for (int i = 0; i < list.size(); i++) {
            total += list.get(i);
        }

        java.text.DecimalFormat df = new java.text.DecimalFormat("#.00");


//        System.out.print(list);
        System.out.print(df.format((double) total / list.size()));
    }
}
