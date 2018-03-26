package algorithm.utils.Tree;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        String b = scanner.nextLine();
        System.out.println(compareTwo(a,b));
    }

    private static int compareTwo(String a, String b) {
        int result = 0;
        int alen = a.length();
        int blen = b.length();
        if (alen < blen) {
            return 0;
        }
        for(int i = 0 ; i <= alen-blen;i++) {
            String sa = a.substring(i, i + blen);
            result += calLength(sa, b);
        }
        return result;
    }

    private static int calLength(String a, String b) {
        int start = 0;
        int count = 0;
        while (start < a.length()) {
            if (a.charAt(start) != b.charAt(start)) {
                count++;
            }
            start++;
        }
        return count;
    }
}
