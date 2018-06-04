package algorithm.utils.Tree;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        if (s.length() == 0) {
            System.out.println(1);
            return;
        } else if (s.length() == 1) {
            if (s.equals(1)) {
                System.out.println(2);
            } else {
                System.out.println(1);
            }
        }
        int[] nums = new int[10];
        for (char c : s.toCharArray()) {
            nums[c - '0'] ++;
        }
        if (nums[0] == 0) {
            System.out.println(1);
            return;
        }
        int minCount = nums[0];
        int index = 0;
        nums[0] ++ ;

        for(int i =0;i<10;i++) {
            if (nums[i] < minCount) {
                index = 1;
                minCount = nums[i];
            }
        }
        int count = 1 + minCount;
        if (index == 0) {
            System.out.println((int) Math.pow(10, count));
        } else {
            int rs = 0;
            while (count > 0) {
                rs += rs * 10 + index;
            }
            System.out.println(rs);
        }
    }
}
