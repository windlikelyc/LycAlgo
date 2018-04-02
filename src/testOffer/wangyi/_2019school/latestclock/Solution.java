package testOffer.wangyi._2019school.latestclock;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int numOfClocks = n;
        int[] hour = new int[numOfClocks];
        int[] minuets = new int[numOfClocks];


        int index = 0;
        while (numOfClocks != 0) {
            numOfClocks--;
            hour[index] =  scanner.nextInt();
            minuets[index] = scanner.nextInt();
            index++;
        }
        int minuteOfRunning = scanner.nextInt();
        int classhour = scanner.nextInt();
        int classmin = scanner.nextInt();


        int time = getMimfrom0(classhour, classmin, minuteOfRunning);
        int a=0, b=0 ;
        int min = Integer.MAX_VALUE;

        for(int i = 0;i < n ;i++) {
            int clockMap = getMimfrom0(hour[i], minuets[i], 0);
            if (time - clockMap >= 0 && time - clockMap < min) {
                a = hour[i];
                b = minuets[i];
                min = time - clockMap;
            }

        }

        System.out.println(a+" "+b);
    }

    private static int getMimfrom0(int classhour, int classmin, int minuteOfRunning) {
        return classhour * 24 + classmin - minuteOfRunning;
    }

}
