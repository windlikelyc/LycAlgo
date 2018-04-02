package testOffer.wangyi._2019school.divideBy3;

import java.util.Scanner;

// 一个数列，分别为1 12  123 1234 12345，求第l个数到底r各数被3整除的个数
public class Main {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long l = scanner.nextLong();
        long r = scanner.nextLong();

        long result = 0;
        long count = 0;

        for (long i = 1; i < l;i++) {
            long tmp = i;
            while (tmp != 0) {
                result += tmp % 10;
                tmp /= 10;
            }

        }

        for(long i = l;i<=r;i++) {
            long tmp = i;
            while (tmp != 0) {
                result += tmp % 10;
                tmp /= 10;
            }

            if (result%3 == 0) {
                count++;
            }
        }

        System.out.println(count);

    }


}
