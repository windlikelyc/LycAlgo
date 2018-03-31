package testOffer.wangyi.shudui;

import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int count = 0;
        for(int x = 1; x<= n;x++) {
            for(int y = 1;y<=n;y++) {
                if(x<y && x>k) {
                    count++;
                    continue;
                }
                if(x%y>=k) count++;
            }
        }
        System.out.println(count);
    }
}
