package algorithm.utils.lString;

/**
 * Created by lyc on 2017/9/14.
 */
public class lString {

    /**
     * @param s 字符串
     * @return 对应的整数，其中a代表最低位(1位),b代表次低(2位),c代表三低位(4位)
     * 依次向左递增
     * 重复字符忽略
     */
    public static int StringToInt(String s) {

        int val = 0;

        for (int i = 0; i < s.length(); i++) {

            //算与a偏移量
            int offset = s.charAt(i) - 'a';

            //移动单位1
            //将所有单位为1的数组合并
            val |= 1 << offset;


        }
        return val;
    }

    public static String reverse(String s) {

        int begin = 0;

        int end = s.length();

        char[] chars = s.toCharArray();

        for (int i = 0; i < (end - begin) / 2; i++) {

            char tmp = chars[begin + i];

            chars[begin + i] = chars[end - i - 1];

            chars[end - i - 1] = tmp;

        }

        String ans = "";
        for (char c : chars) {
            ans += c;
        }


        return ans;

    }


}
