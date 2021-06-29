package MQ4_01_Route_Between_Nodes;
import helper.Node;

public class Main {
    public static void main(String args[]) {
        Node<Integer> leftNode = new Node<Integer>(2);
        Node<Integer> rightNode = new Node<Integer>(3);
        Node<Integer> rootNode = new Node<Integer>(1);
        rootNode.setLeftChild(leftNode);
        rootNode.setRightChild(rightNode);


        rootNode.preOrderTraversal(rootNode);
        System.out.println();
        rootNode.inOrderTraversal(rootNode);
        System.out.println();
        rootNode.postOrderTraversal(rootNode);
    }
}
