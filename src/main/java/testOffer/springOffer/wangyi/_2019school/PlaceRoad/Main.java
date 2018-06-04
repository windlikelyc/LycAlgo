package testOffer.springOffer.wangyi._2019school.PlaceRoad;

import java.util.Scanner;

// 输入一个字符串，由.和X组成。一盏灯可以照亮三个地方。球最少需要几盏灯。
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t != 0) {
            t--;
            int len = scanner.nextInt();
            String s = scanner.nextLine();

            count(s);
        }

    }

    private static void count(String s) {

        int count = 0;
        for(int i= 0 ; i <s.length();i++) {
            if (s.charAt(i) == 'X') {
                continue;
            }
            count++;
            i += 2;
        }
        System.out.println(count);

    }
}
