package LycAlgo.Problems.a111;

/**
 * Created by lyc on 2017/9/14.
 */
public class Solution {
    /**
     * 这个确实是自己想过的，比如讲abc 替换成111这样的
     * <p>
     * 只是没想到 从低位开始
     * <p>
     * 学学bit的操作，每个字符算与a的偏移量并左移偏移量个单位
     * <p>
     * 或等运算相当于加法运算，只不过每一栋一段距离加一个元素，最后的那个元素就是字符串
     * <p>
     * 之前也考虑过如果a和aa表示一样怎么办
     * <p>
     * 原来是用了双重循环求最大值Orz
     *
     * @param words
     * @return
     */

    public static int maxProduct(String[] words) {
        if (words == null || words.length == 0)
            return 0;
        int len = words.length;
        int[] value = new int[len];
        for (int i = 0; i < len; i++) {
            String tmp = words[i];
            value[i] = 0;
            for (int j = 0; j < tmp.length(); j++) {
                value[i] |= 1 << (tmp.charAt(j) - 'a');
            }
        }
        int maxProduct = 0;
        for (int i = 0; i < len; i++)
            for (int j = i + 1; j < len; j++) {
                if ((value[i] & value[j]) == 0 && (words[i].length() * words[j].length() > maxProduct))
                    maxProduct = words[i].length() * words[j].length();
            }
        return maxProduct;
    }
}
