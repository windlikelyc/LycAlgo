package testAlgo.ch03.second;

import testAlgo.ch03.Node;
import testAlgo.ch03.TreeBuilder;
import testAlgo.ch03.first.BinaryTree;

public class Run {
    public static void main(String[] args) {

        Solution s = new Solution();

        Node root = TreeBuilder.build(
                //"1(2()(4(7)(8()(11(13)(15)))))(3(5(9(12(15)(16)))(10))(6))"
                "4(2(3)(1))(6()(5))"
        );

        BinaryTree b = new BinaryTree();
        b.preOrderUnRecur(root);

        s.printEdge1(root);

    }
}
