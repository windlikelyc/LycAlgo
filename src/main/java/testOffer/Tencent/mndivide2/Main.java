package testOffer.Tencent.mndivide2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        long m = scanner.nextLong();
        if (n >= 2 * m) {
            System.out.println(m*n/2);
        } else if (n < m) {
            Long tmp = (1 + n) * n / 2;
            tmp = 0 - tmp;
            System.out.println(tmp);
        }else{
            System.out.println(0);
        }
    }
}
