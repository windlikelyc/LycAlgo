package testOffer.sanliuling;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        do {
            T--;
            int ans = 0;
            int[] nums = new int[3];
            nums[0] = scanner.nextInt();
            nums[1] = scanner.nextInt();
            nums[2] = scanner.nextInt();
            Arrays.sort(nums);
            if (nums[2] >= (nums[1] + nums[0]) * 2) {
                System.out.println(nums[0] + nums[1]);
                return;
            }
            System.out.println((nums[0] + nums[1] + nums[2])/3);
        } while (T != 0);
    }
}
