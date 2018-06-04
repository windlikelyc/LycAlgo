package testOffer.springOffer.zhaoshang.recommender;

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int line = scanner.nextInt();
        int n = scanner.nextInt();
        scanner.nextLine();

        Map<String,String[]> map = new HashMap();
        String[] dalao = new String[line];
        for(int i = 0; i < line ;i++) {
            String[] members = scanner.nextLine().split(" ");
            dalao[i] = members[0];
            if (members[2].equals("*")) {
                String[] tx = new String[1];
                tx[0] = members[1];
                map.put(members[0], tx);
            } else {
                String[] tx = new String[2];
                tx[0] = members[1];
                tx[1] = members[2];
                map.put(members[0], tx);
            }
        }

        Map<String, Set> ans = new HashMap<>();
        for(int i = 0 ; i <line ;i++) {
            HashSet set = new HashSet();
            findrecommeder(dalao[i],set,map);
            ans.put(dalao[i], set);
        }
        boolean hasMember = false;
        for (Map.Entry<String,Set> entry : ans.entrySet()) {
            if (entry.getValue().size() >= n) {
                hasMember = true;
                System.out.print(entry.getKey()+" ");
            }
        }
        if (!hasMember) {
            System.out.println("None");
        }
    }

    private static void findrecommeder(String recommender, HashSet recommendeds, Map<String, String[]> map) {
        String[] kk = map.get(recommender);
        if(kk==null) return;
        for(int i = 0 ; i< kk.length;i++) {
            if (!recommendeds.contains(kk[i])) {
                recommendeds.add(kk[i]);
                findrecommeder(kk[i],recommendeds,map);
            }
        }
    }

}
