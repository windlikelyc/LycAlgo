package LycAlgo.utils.Tree;

import java.util.HashMap;
import java.util.Map;

public class TreeBuilder {

    private TreeNode head = null;
    private TreeNode currentNode = null;
    private Map<TreeNode, TreeNode> map = new HashMap<>();

    /**
     * 新建一个构造器，存储一个树的根节点
     * @param init
     */
    public TreeBuilder(int init) {
        TreeNode t = new TreeNode(init);
        head = t;
        map.put(t, null);
        currentNode = head;
    }

    public TreeBuilder(){
        this(0);
    }

    /**
     * 返回当前节点
     * @return
     */
    public int getCurrentValue(){
        return currentNode.val;
    }

    public TreeBuilder left(int x) throws Exception {
        if(currentNode.left == null){
            currentNode.left = new TreeNode(x);
            TreeNode pre = currentNode;
            currentNode = currentNode.left;
            map.put(currentNode, pre);
        }else{
            throw new Exception("The left node you add already has node");
        }
        return this;
    }

    public TreeBuilder right(int x) throws Exception {
        if(currentNode.right == null){
            currentNode.right = new TreeNode(x);
            TreeNode pre = currentNode;
            currentNode = currentNode.right;
            map.put(currentNode, pre);
        }else{
            throw new Exception("The right node you add already has node");
        }
        return this;
    }


    public TreeBuilder back(){
        currentNode =  map.get(currentNode) == null ? currentNode : map.get(currentNode);
        return this;
    }

    /**
     * 回退n步
     * @param n
     * @return
     */
    public TreeBuilder back(int n) {
        while (n != 0) {
            currentNode =  map.get(currentNode) == null ? currentNode : map.get(currentNode);
            n--;
        }
        return this;
    }

    public TreeBuilder refresh(){
        currentNode = head;
        return this;
    }

    public TreeNode get(){
        return this.head;
    }

    public static TreeNode getDefaultFullTree()throws Exception{
        TreeBuilder treeBuilder = new TreeBuilder(1);
        TreeNode t = treeBuilder.left(2).left(4).back().right(5).refresh().right(3).left(6).back().right(7).get();
        System.out.println(t.toString2());
        return t;
    }

}
