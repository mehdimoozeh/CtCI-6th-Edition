package MQ4_06_Successor;

import helper.BST;

public class Main {
    public static void main(String args[]) {
        BST root = new BST(6);
        root.insertNode(3);
        root.insertNode(9);
        root.insertNode(2);
        root.insertNode(5);
        root.insertNode(7);
        root.insertNode(11);
        root.insertNode(1);
        root.insertNode(4);
        root.insertNode(8);
        root.insertNode(10);
        root.insertNode(12);

//        BST node = root.findOne(8);
//        BST next = successor1(node);
//        System.out.println(next.getVal());

        BST node = root.findOne(12);
        BST next = successor(node);
        System.out.println(next.getVal());
    }

    private static BST successor(BST node) {
        if (node == null) return null;
        if (node.getRight() != null) {
            return leftMostChild(node.getRight());
        } else {
            BST q = node;
            BST x = q.getParent();
            while(x != null && x.getLeft() != q){
                q = x;
                x = x.getParent();
            }
            return x;
        }
    }

    private static BST leftMostChild(BST node) {
        if (node == null) return null;
        while(node.getLeft() != null)
            node = node.getLeft();
        return node;
    }
}
