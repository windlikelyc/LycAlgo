package LycAlgo.Problems.longestCommonPrefix;

public class SolutionUsingBinarySearch {

    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }
        int minLen = Integer.MAX_VALUE;
        for (String string : strs) {
            minLen = Math.min(minLen, string.length());
        }
        int low = 1;
        int high = minLen;
        while (low <= high) {
            int middle = (low + high) / 2;
            if(isCommonPrefix(strs,middle))
                low = middle + 1;
            else
                high = middle - 1;
        }
        return strs[0].substring(0, (low + high) / 2);
    }

    private boolean isCommonPrefix(String[] strs, int len) {
        String str1 = strs[0].substring(0, len);
        for(int i = 1;  i < strs.length; i++)
            if(!strs[i].startsWith(str1))
                return false;
        return true;
    }

    public static void main(String[] args) {
        SolutionUsingBinarySearch solutionUsingBinarySearch = new SolutionUsingBinarySearch();
        solutionUsingBinarySearch.longestCommonPrefix(new String[]{"app",
                "apple","applet","apxlication","append"});
    }

}
