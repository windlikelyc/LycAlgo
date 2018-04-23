package testOffer.Meituan;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        int[] nums = new int[3];
        nums[0] = a;
        nums[1] = b;
        nums[2] = c;
        int count = 0;
        while (!(nums[0] == nums[1] && nums[1] == nums[2])) {
            Arrays.sort(nums);
            if (nums[0] != nums[1]) {
                nums[1] -= 2;
                nums[2] -= 2;
                count++;
            }else {
                nums[2]--;
                count++;
            }
        }
        System.out.println(count);

    }
}
