package algorithm.utils;

import algorithm.utils.Tree.TreeBuilder;
import algorithm.utils.Tree.TreeNode;

/**
 * Created by lyc on 2017/9/1.
 */
public class Dirver {
    public static void main(String[] a) throws Exception {
        TreeBuilder treeBuilder = new TreeBuilder(1);
        TreeNode tree = treeBuilder.get();
        System.out.println(tree);
    }
}
