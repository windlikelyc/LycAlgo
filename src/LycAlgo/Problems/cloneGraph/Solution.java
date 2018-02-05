package LycAlgo.Problems.cloneGraph;



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


}
