package testAlgo.ch03.second;

import testAlgo.ch03.Node;

public class Solution {

//    public void printEdge1(Node head) {
//        if (head == null) {
//            return;
//        }
//        int height = getHeight(head, 0);
//        Node[][] edgeMap = new Node[height][2];
//        setEdgeMap(head, 0, edgeMap);
//        // 打印作边界
//        for (int i = 0  ; i != edgeMap.length ; i ++) {
//            System.out.print(edgeMap[i][0].value + " ");
//        }
//        // 打印机不是左边界也不是右边界的叶子节点
//        printLeafNotInMap(head, 0, edgeMap);
//        // 打印右边界,但不是左边界的叶子节点
//        for (int i = edgeMap.length - 1 ; i != -1 ; i--) {
//            if (edgeMap[i][0] != edgeMap[i][1]) {
//                System.out.print(edgeMap[i][1].value+" ");
//            }
//        }
//        System.out.println();
//    }
//
//    private void printLeafNotInMap(Node head, int i, Node[][] edgeMap) {
//        if (head == null) {
//            return;
//        }
//        if (head.left == null && head.right == null && head !=
//                edgeMap[i][0] && head != edgeMap[i][1]) {
//            System.out.print(head.value+" ");
//        }
//        printLeafNotInMap(head.left, i + 1, edgeMap);
//        printLeafNotInMap(head.right, i + 1, edgeMap);
//
//    }
//
//    private void setEdgeMap(Node head, int i, Node[][] edgeMap) {
//        if (head == null) {
//            return;
//        }
//        //这里用了天然顺序,因为肯定是先左后右,所以只要设置了最左就不要改变了
//        // 每次更新最右即可
//        edgeMap[i][0] = edgeMap[i][0] == null ? head : edgeMap[i][0];
//        edgeMap[i][1] = head;
//        setEdgeMap(head.left, i + 1, edgeMap);
//        setEdgeMap(head.right, i + 1, edgeMap);
//    }
//
//    private int getHeight(Node head, int h) {
//        if(head == null){
//            return h;
//        }
//        return Math.max(getHeight(head.left, h + 1), getHeight(head.right, h + 1));
//    }
}
