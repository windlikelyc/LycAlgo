package algorithm.Problems;

import java.util.Scanner;

/**
 * @author lyc windlikelyc@gmail.com
 * @date 2018/6/20 17:12
 */
public class Eqution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println( new Eqution().solveEquation(scanner.nextLine()));
    }

    public String solveEquation(String equation) {
        int leftCountOfX = 0;
        int leftCount = 0;
        int rightCountOfX = 0;
        int rightCount = 0;

        int symbol = 1; // 初始为正
        boolean isLeft = true;// 初始为左边
        int i = 0;

        while (i < equation.length()){
            if (equation.charAt(i) == '-') {
                i++;
                symbol = -1;
            }
            int j = i; // 记录当前遍历到的下标
            while ( j < equation.length() && Character.isDigit(equation.charAt(j))) {
                j++;
            }

            if(isLeft){
                // 遍历完后看后面是否跟着x
                if (equation.charAt(j) == 'x') {
                    if ("".equals(equation.substring(i, j))) {
                        leftCountOfX += symbol*1;
                    }else {
                        leftCountOfX += symbol*Integer.valueOf(equation.substring(i, j));
                    }
                }else {
                    leftCount += symbol*Integer.valueOf(equation.substring(i, j));
                }
            }else {
                // 遍历完后看后面是否跟着x
                if (j < equation.length() && equation.charAt(j) == 'x') {
                    if ("".equals(equation.substring(i, j))) {
                        rightCountOfX += symbol*1;
                    }else {
                        rightCountOfX += symbol*Integer.valueOf(equation.substring(i, j));
                    }
                }else {
                    rightCount += symbol*Integer.valueOf(equation.substring(i, j));
                }
            }


            if (j == equation.length()) {
                break;
            }
            if (equation.charAt(j) == 'x') {
                j++; // 忽略x
            }
            if (j == equation.length()) {
                break;
            }

            if (equation.charAt(j) == '+') {
                symbol = 1;
            } else if (equation.charAt(j) == '-') {
                symbol = -1;
            } else if (equation.charAt(j) == '=') {
                symbol = 1;
                isLeft = false;
            }
            i = j + 1;
        }

//        System.out.println("leftCountOfX:"+leftCountOfX);
//        System.out.println("left:" + leftCount);
//        System.out.println("rightCountOfX:" + rightCountOfX);
//        System.out.println("rightCount:" + rightCount);

        int numOfX = leftCountOfX + -1 * rightCountOfX;
        int num = rightCount + -1 * leftCount;

        if (numOfX == 0 && num != 0) {
            return "No solution";
        } else if (numOfX == 0 && num == 0) {
            return  "Infinite solutions";
        }else {
            return "x=" + num / numOfX;
        }
    }

}
