package algorithm.Problems.largestNumber;


import java.util.Comparator;
import java.util.PriorityQueue;

public class Solution {
    public String largestNumber(int[] nums) {

        PriorityQueue<Integer> p = new PriorityQueue(new Comparator() {
            @Override
            //o1 da fan hui -1 , o2 da fa hui 1
            public int compare(Object o1, Object o2) {
                String s1 = o1 + "";
                String s2 = o2 + "";

                String t1 = s1 + s2;
                String t2 = s2 + s1;

                int j = 0;
                while (j < t1.length()) {
                    if (t1.charAt(j) == t2.charAt(j)) {
                        j++;
                        continue;
                    } else if (t1.charAt(j) > t2.charAt(j)) {
                        return -1;
                    } else if (t2.charAt(j) > t1.charAt(j)) {
                        return 1;
                    }
                    j++;
                }
                return 0;
            }

//                while (i < s1.length() && j < s2.length()) {
//
//                    if (s1.charAt(i) > s2.charAt(j)) {
//                        return -1;
//                    }else if(s1.charAt(i) < s2.charAt(j)){
//                        return 1;
//                    }
//                    i++;
//                    j++;
//
//                }


//                if(i == s1.length()){
//                    if(s1.charAt(i-1) > s2.charAt(j)){
//                        return -1;
//                    }else if(s1.charAt(0) < s2.charAt(j)){
//                        return 1;
//                    }
//                }
//
//                if(j == s2.length()){
//                    if(s2.charAt(j-1) > s1.charAt(i)){
//                        return 1;
//                    }else if(s2.charAt(0) < s1.charAt(i)){
//                        return -1;
//                    }
//
//                }

//                if(s1.length() > s2.length()){
//                    int delta = s1.length() - i;
//                    return s1.charAt(delta) > s1.charAt(0) ? -1 : 1;
//                }else if(s1.length() < s2.length()){
//                    int delta = s2.length() - j;
//                    return s2.charAt(delta) > s2.charAt(0) ? -1 : 1;
//                }else{
//                    return 0;
//                }
//            }

        });

        for(int num : nums){
            p.add(num);
        }

        String ans = "";

        while (!p.isEmpty()){
            System.out.println(p.peek());
            ans += p.poll();
        }

        while (ans.length()>1 && ans.charAt(0) == '0'){
            ans = ans.substring(1, ans.length());
        }

        return ans;

    }



}
