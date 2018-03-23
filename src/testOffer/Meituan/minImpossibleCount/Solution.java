package testOffer.Meituan.minImpossibleCount;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int[] used = new int[10];
        int digit = -1, min = Integer.MAX_VALUE;//digit 出现最少次数的数字值 min 出现最少次数数字的次数
        for (char c : input.toCharArray()) {
            used[c - '0']++;
        }
        for (int i = 1; i < 10; i++) {
            if (min > used[i]) {
                min = used[i];
                digit = i;
            }
        }
        if (used[0] + 1 <= min) {
            System.out.println("1" + fill(min, '0'));
        } else {
            System.out.println(fill(min + 1, (char) ('0' + digit)));
        }

    }


    private static String fill(int count, char c) {
        String s = "";
        for (int i = 0; i < count; i++) {
            s += c;
        }
        return s;
    }
}
