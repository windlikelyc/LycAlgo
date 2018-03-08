package LycAlgo.utils.Tree;

/**
 * Created by lyc on 2017/8/23.
 */
public class TreeNode {

    private StringBuilder stringBuilder = new StringBuilder();
    public int val;
    public TreeNode left;
    public TreeNode right;

    public TreeNode(int x) {
        val = x;
    }

    public String toString2(){
        preOrder(this);
        return stringBuilder.toString();
    }

    private void preOrder(TreeNode node) {
        stringBuilder.append(node.val);
        if(node.left != null){
            stringBuilder.append("↙");
            preOrder(node.left);
        }

        if(node.right != null){
            stringBuilder.append("↘");
            preOrder(node.right);
        }

        stringBuilder.append("↑");
    }

}
