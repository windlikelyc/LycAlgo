package LycAlgo.Problems.a109;

/**
 * Created by lyc on 2017/9/14.
 */

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * In English, we have a concept called root, which can be followed by some other words to form another longer word - let's call this word successor. For example, the root an, followed by other, which can form another word another.
 * <p>
 * Now, given a dictionary consisting of many roots and a sentence. You need to replace all the successor in the sentence with the root forming it. If a successor has many roots can form it, replace it with the root with the shortest length.
 * <p>
 * You need to output the sentence after the replacement
 **/
public class MySolution {

    public String replaceWords(List<String> dict, String sentence) {

        String[] tmp = sentence.split(" ");
        String[] ans = new String[tmp.length];
        Collections.sort(dict);
        for (int i = 0; i < tmp.length; i++) {

            for (String s : dict) {

                if (tmp[i].indexOf(s) == 0) {
                    ans[i] = s;
                    break;
                }

            }

            ans[i] = (ans[i] == null ? tmp[i] : ans[i]);


        }

        String string = "";
        for (int j = 0; j < ans.length - 1; j++) {
            string += ans[j];
            string += " ";
        }
        string += ans[ans.length - 1];


        System.out.print(string);

        return string;
    }

    @Test
    public void test() {

        List l = new ArrayList();
        l.add("cat");
        l.add("rat");
        l.add("bat");

        replaceWords(l, "the cattle was rattled by the battery");


    }


}
