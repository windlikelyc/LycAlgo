package algorithm.utils.Tree;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lyc on 2017/8/23.
 */
public class Tree {
    public TreeNode root;

    public Tree(int a[]) {
        root = BinaryInit(a, 0);
    }

    public Tree(TreeNode root){ this.root = root ;}

    private TreeNode BinaryInit(int[] a, int index)
    {
        if (index > a.length - 1)
            return null;
        TreeNode t = new TreeNode(a[index]);
        t.left = BinaryInit(a, 2*index+1);
        t.right = BinaryInit(a, 2*index+2);
        return t;
    }

    public void PreOrder(){
        PreOrder(root);
    }

    private void PreOrder(TreeNode t){
        if(t==null) return;
        System.out.println(t.val);
        if(root.left!=null) PreOrder(t.left);
        if(root.right!=null) PreOrder(t.right);
    }

    public void PreOr(TreeNode t, List l){
        if(t == null) return;
        l.add(t.val);
        List now = new ArrayList(l);
        System.out.println(now);
        PreOr(t.left , now);
        PreOr(t.right , now);
        return;
    }

    public TreeNode reConstructBinaryTree(int [] pre,int [] in) {
        return construct(pre, 0, pre.length - 1, in, 0, in.length - 1);
    }

    private TreeNode construct(int[] pre, int preStart, int preEnd, int[] in, int inStart, int inEnd) {
        if (preStart > preEnd) {
            return null;
        }
        int value = pre[preStart];
        int i = inStart;
        while (in[i] != value) {
            i++;
        }
        TreeNode t = new TreeNode(value);
        t.left = construct(pre, preStart + 1, preStart + i - inStart, in, inStart, i - 1);
        t.right = construct(pre, preStart + i - inStart+1,  preEnd, in, i+1, inEnd);
        return t;
    }

    public void show() {
        System.out.println(root.toString());
    }
    public static void main(String[] args) {
        Tree tree = new Tree(new int[]{0});
        TreeNode t = tree.reConstructBinaryTree(new int[]{1, 2, 4, 7, 3, 5, 6, 8},new int[]{4,7,2,1,5,3,8,6});
        System.out.println(t.toString());;
    }

}
