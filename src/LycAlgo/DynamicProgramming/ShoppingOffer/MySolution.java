package LycAlgo.DynamicProgramming.ShoppingOffer;


import java.util.ArrayList;
import java.util.List;

/**
 * Created by lyc on 2017/9/21.
 */
public class MySolution {

    /**
     * 这他吗有点像麦当劳刷组合餐
     *
     * @param price   物品单价，多少个不知道
     * @param special 合买优惠价(也不一定优惠，也不一定每种都有)
     * @param needs   需求
     * @return 最小花费
     */
    public int shoppingOffers(List<Integer> price, List<List<Integer>> special, List<Integer> needs) {
        return shopping(price, special, needs);
    }

    public int shopping(List<Integer> price, List<List<Integer>> special, List<Integer> needs) {
        int j = 0, res = dot(needs, price);
        for (List<Integer> s : special) {
            ArrayList<Integer> clone = new ArrayList<>(needs);
            for (j = 0; j < needs.size(); j++) {
                int diff = clone.get(j) - s.get(j);
                if (diff < 0)
                    break;
                clone.set(j, diff);
            }
            if (j == needs.size())
                res = Math.min(res, s.get(j) + shopping(price, special, clone));
        }
        return res;
    }

    public int dot(List<Integer> a, List<Integer> b) {
        int sum = 0;
        for (int i = 0; i < a.size(); i++) {
            sum += a.get(i) * b.get(i);
        }
        return sum;
    }




}
