package testOffer.jingdong;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        scanner.nextLine();

        while (N != 0) {
            N--;

            String s = scanner.nextLine();

            String[] num = s.split(" ");
            int[] nums = new int[num.length];
            int i = 0;
            for (String su: num) {
                nums[i] = Integer.parseInt(su);
                i++;
            }

            int k = nums[0];
            int m = 1;
            int n = nums.length - 1;

            int min = nums[m] / nums[n];
            while (k != 0 && m < n) {
                k--;


            }
            System.out.println(nums[m]+" "+nums[n]);
        }
    }
}
