package algorithm.Problems.LicenseKeyFormat;

public class Solution {
    public String licenseKeyFormatting(String S, int K) {
        S = S.toUpperCase();
        StringBuilder sb = new StringBuilder();
        for(int i = 0;i< S.length() ; i++) {
            if (S.charAt(i) != '-') {
                sb.append(S.charAt(i));
            }
        }

        String Swithoutdash = sb.toString();

        String ans = "";
        int k = K;
        for(int i = Swithoutdash.length()-1 ; i >= 0 ; i--) {
            if(k == 0){
                ans = "-" + ans;
                i--;
                k = K;
            }else {
                ans = Swithoutdash.charAt(i) + ans;
                k--;
            }
        }
        return ans;
    }
}
