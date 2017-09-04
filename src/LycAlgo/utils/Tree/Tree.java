package LycAlgo.utils.Tree;

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

}
