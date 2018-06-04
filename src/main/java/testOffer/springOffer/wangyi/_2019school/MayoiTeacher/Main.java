package testOffer.springOffer.wangyi._2019school.MayoiTeacher;

// 老师迷路了，开始冲北，然后左转右转，问最后面向那

import java.util.Scanner;

/**
 * 3
 LRR


 */
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String directions = scanner.next();

        int direct = 0;// 0-N 1-E 2-S 3-W


        for (char c : directions.toCharArray()) {

            if (c == 'L') {
                if (direct - 1 < 0) {
                    direct += 4;
                }
                direct -= 1;
            }

            if (c == 'R') {
                if (direct + 1 > 3) {
                    direct -= 4;
                }
                direct += 1;
            }

        }

        switch (direct) {
            case 0:
                System.out.println('N');
                break;
            case 1:
                System.out.println('E');
                break;
            case 2:
                System.out.println('S');
                break;
            case 3:
                System.out.println('W');
                break;
        }

    }
}
