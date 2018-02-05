package LycAlgo;

import LycAlgo.utils.Trie.Trie;

import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Calendar;
import java.util.Date;
import java.util.MissingResourceException;

/**
 * Created by lyc on 2017/9/6.
 */

/**
 */
public class Main {

    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) return "";
        String prefix = strs[0];
        for (int i = 1; i < strs.length; i++)
            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) return "";
            }
        return prefix;
    }

    public static void main(String[] args) {

        Main main = new Main();
        System.out.println(main.longestCommonPrefix(new String[]{"leets","leetcode","leed","leeds"}));

    }




}
