package LycAlgo.Divider.differentWayToAddParentness;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    public List<Integer> diffWaysToCompute(String input,int dep ) {
        List<Integer> res = new ArrayList<Integer>();
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (c == '-' || c == '+' || c == '*') {
                String a = input.substring(0, i);
                String b = input.substring(i + 1);
                List<Integer> al = diffWaysToCompute(a,dep+1);
                System.out.println(al+""+dep);
                List<Integer> bl = diffWaysToCompute(b,dep+1);
                System.out.println(bl+""+dep);
                for (int x : al) {
                    for (int y : bl) {
                        if (c == '-') {
                            res.add(x - y);
                        } else if (c == '+') {
                            res.add(x + y);
                        } else if (c == '*') {
                            res.add(x * y);
                        }
                    }
                }
            }
        }
        if (res.size() == 0) res.add(Integer.valueOf(input));
        return res;
    }


    @Test
    public void test(){
        diffWaysToCompute("1+2*3+4",0);
    }
}