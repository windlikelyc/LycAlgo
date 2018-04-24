package testDesignPattern.desiginBuddhism.prototype;

import java.util.ArrayList;
import java.util.List;

public class Rectangle extends Shape {

    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        System.out.println(r.letterCasePermutation("a1b2"));


    }

    public List<String> letterCasePermutation(String S) {

        int i = 0;
        for (char c : S.toCharArray()) {
            if (Character.isLetter(c)) {
                i++;
            }
        }

        List<String> list = new ArrayList<>();

        for (int t = 0; t < Math.pow(2, i); t++) {

            StringBuilder sb = new StringBuilder();
            int index = 0;
            for (char c : S.toCharArray()) {
                if (Character.isDigit(c)) {
                    sb.append(c);
                } else {
                    if (((1 & (t >> index)) == 1)) {
                        sb.append(Character.toLowerCase(c));
                        index++;
                    } else {
                        sb.append(Character.toUpperCase(c));
                        index++;
                    }
                }
            }
            list.add(sb.toString());

        }

        return list;
    }

}
