package testAlgo.ch03.first;

import testAlgo.ch03.Node;
import testAlgo.ch03.TreeBuilder;

public class Run {
    public static void main(String[] args) {
        Node n = TreeBuilder.build("1(2(4)(5))(3(6)(7))" );
        BinaryTree b = new BinaryTree();
        b.inOrderUnRecur(n);
        b.preOrderUnRecur(n);
        b.postOrderUnRecur1(n);
        b.postOrderUnRecur2(n);
    }
}
