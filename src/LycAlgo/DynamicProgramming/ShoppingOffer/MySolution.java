package LycAlgo.DynamicProgramming.ShoppingOffer;

import org.junit.Test;

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


    @Test
    public void test() {
        List<Integer> price = new ArrayList<>();
        price.add(2);
        price.add(5);
        List<List<Integer>> special = new ArrayList<>();
        List<Integer> special1 = new ArrayList<>();
        List<Integer> special2 = new ArrayList<>();
        special1.add(3);
        special1.add(0);
        special1.add(5);
        special2.add(1);
        special2.add(2);
        special2.add(10);
        special.add(special1);
        special.add(special2);
        List<Integer> needs = new ArrayList<>();
        needs.add(3);
        needs.add(2);
        shoppingOffers(price, special, needs);
    }

}
