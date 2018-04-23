package testOffer.jingdong;

import java.util.Map;
import java.util.Scanner;

public class Main2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        while (n > 0) {
            long a = scanner.nextLong();
            if (a % 2 != 0 || (a & (a - 1)) == 0) {
                System.out.println("No");
            }
            else {
                long y = 2;
                long x = a / 2;
                while (x % 2 != 1) {
                    x /= 2;
                    y *= 2;
                }
                System.out.println(x+" "+y);
            }
            n--;
        }
    }

}
