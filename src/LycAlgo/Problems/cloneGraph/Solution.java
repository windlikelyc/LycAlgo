package LycAlgo.Problems.cloneGraph;


import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class UndirectedGraphNode {
    int label;
    List<UndirectedGraphNode> neighbors;
    UndirectedGraphNode(int x) { label = x; neighbors = new ArrayList<UndirectedGraphNode>(); }
};


public class Solution {

    Map<Integer,UndirectedGraphNode> allmap = new HashMap<>();

    public UndirectedGraphNode cloneGraph(UndirectedGraphNode node) {

        UndirectedGraphNode cur = null;
        if(!allmap.containsKey(node.label)){
            cur = new UndirectedGraphNode(node.label);
            allmap.put(node.label,new UndirectedGraphNode(node.label));
        }

        for(UndirectedGraphNode n: node.neighbors){

            if(!allmap.containsKey(n.label)){
                cloneGraph(n);
            }
            allmap.get(node.label).neighbors.add(allmap.get(n.label));
        }

        return allmap.get(node.label);
    }


    @Test
    public void test(){

        UndirectedGraphNode u0 = new UndirectedGraphNode(0);
        UndirectedGraphNode u1 = new UndirectedGraphNode(1);
        UndirectedGraphNode u2 = new UndirectedGraphNode(2);

        u0.neighbors.add(u1);
        u0.neighbors.add(u2);
        u1.neighbors.add(u2);
        u2.neighbors.add(u2);

        cloneGraph(u0);

    }
}
