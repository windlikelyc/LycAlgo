package LycAlgo;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by lyc on 2017/9/6.
 */

/**
 */
public class Main {

    public int numJewelsInStones(String J, String S) {
        Set<Character> set = new HashSet();
        for(Character c:J.toCharArray()){
            set.add(c);
        }
        int t=0;
        for(int i = 0 ; i <S.length();i++){
            if (set.contains(S.charAt(i))) {
                t++;
            }
        }
        return t;
    }
    public List<String> letterCasePermutation(String S) {
        int B = 0;
        for (char c: S.toCharArray())
            if (Character.isLetter(c))
                B++;
        List<String> ans = new ArrayList();
        for (int bits = 0; bits < 1<<B; bits++) {
            int b = 0;
            StringBuilder word = new StringBuilder();
            for (char letter: S.toCharArray()) {
                if (Character.isLetter(letter)) {
                    if (((bits >> b++) & 1) == 1)
                        word.append(Character.toLowerCase(letter));
                    else
                        word.append(Character.toUpperCase(letter));
                } else {
                    word.append(letter);
                }
            }

            ans.add(word.toString());
        }
        return ans;
    }

    public static void main(String[] args) {

        Main main = new Main();
        main.showNum(new int[]{10, 2, 4, 5, 6, 7, 3, 1, 9});


    }

    public void showNum(int[] a) {
        int[] b = new int[10];
        for (int i = 0; i < a.length; i++) {
            b[a[i] - 1] = a[i];
        }
        for (int i = 0; i < b.length; ++i) {
            System.out.print(b[i] + " ");
        }
    }




}
