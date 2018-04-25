package testOffer.springOffer.Tencent.test;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main{

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        while (n > 0) {

            int[] xs = new int[4];
            int[] ys = new int[4];

            for(int i=0;i<4;i++) {
                xs[i] = scanner.nextInt();
            }
            for(int i=0;i<4;i++) {
                ys[i] = scanner.nextInt();
            }
            double l1 = getlengt(xs[0], ys[0], xs[1], ys[1]);
            double l2 = getlengt(xs[0], ys[0], xs[2], ys[2]);
            double l3 = getlengt(xs[0], ys[0], xs[3], ys[3]);
            double l4 = getlengt(xs[1], ys[1], xs[2], ys[2]);
            double l5 = getlengt(xs[1], ys[1], xs[3], ys[3]);
            double l6 = getlengt(xs[2], ys[2], xs[3], ys[3]);
            Set set = new HashSet<>();
            set.add(l1);
            set.add(l2);
            set.add(l3);
            set.add(l4);
            set.add(l5);
            set.add(l6);
            if (set.size() == 2) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
            n--;
        }
    }

    private static double getlengt(int x, int y, int x1, int y1) {

        return Math.pow(x-x1,2) + Math.pow(y-y1,2);

    }


}
