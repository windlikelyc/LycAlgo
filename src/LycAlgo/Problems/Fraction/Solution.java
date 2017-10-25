package LycAlgo.Problems.Fraction;

import java.util.List;

import java.util.ArrayList;

/**
 * Input:"-1/2+1/2"
 * Output: "0/1"
 */

public class Solution {
    public String fractionAddition(String expression) {
        expression += "e";
        String ans = "";
        boolean ispositive = true;
        List<String> fracions = new ArrayList<>();
        int j = 0;
        for (int i = 0 ; i < expression.length() ; i++) {
            if((expression.charAt(0)=='-')) {
                ispositive = false;
                j++;
                continue;
            }
            if(expression.charAt(i)=='+'||expression.charAt(i)=='e'){
                fracions.add(ispositive? expression.substring(j, i):"-"+expression.substring(j, i));
                j = i + 1;
                ispositive = true;
            }
            if (expression.charAt(i) == '-'||expression.charAt(i)=='e') {
                fracions.add(ispositive?expression.substring(j, i):"-"+expression.substring(j, i));
                j = i + 1;
                ispositive = false;
            }
        }
        System.out.print(fracions);
        return "";
    }

}