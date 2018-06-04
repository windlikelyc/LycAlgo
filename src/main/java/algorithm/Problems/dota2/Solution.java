package algorithm.Problems.dota2;

/**
 * Created by lyc on 2017/11/20.
 */
public class Solution {

    // RD DR DR
    // DD RRR D win
    // RR DDD R win

    // RD DR R



    public String predictPartyVictory(String senate) {
        boolean RwillWin = true;
        int num_of_R = 0;
        int num_of_D = 0;
        for(int i = 0 ; i < senate.length() ; i++) {
            if (senate.charAt(i) == 'R') {
                num_of_R++;
                if (i > 0 && senate.charAt(i - 1) == 'R') {
                    return "Radiant";
                }
            }else {
                num_of_D++;
                if (i > 0 && senate.charAt(i - 1) == 'D') {
                    return "Dire";
                }
            }
            if(num_of_R > num_of_D) RwillWin = true;
            if(num_of_D > num_of_R) RwillWin = false;
        }
        if (num_of_D == num_of_R) {
            return RwillWin ? "Radiant" : "Dire";
        }
        return num_of_D > num_of_R ? "Dire" : "Radiant";

    }

}
