package MQ4_02_Minimal_Tree;

import helper.Node;

public class Main {

    public static void main(String args[]) {

        /*Node<Integer> leftNode = new Node<Integer>(2);
        Node<Integer> rightNode = new Node<Integer>(3);
        Node<Integer> rootNode = new Node<Integer>(1);
        rootNode.setLeftChild(leftNode);
        rootNode.setRightChild(rightNode);

        rootNode.preOrderTraversal(rootNode);
        System.out.println();
        rootNode.inOrderTraversal(rootNode);
        System.out.println();
        rootNode.postOrderTraversal(rootNode);*/


        Integer[] sortedNumbers = {4, 5, 10, 19, 20, 21};
        Node root = minimalTree(sortedNumbers);
        root.inOrderTraversal(root);
    }

    public static Node minimalTree(Integer[] numbers) {
        if (numbers == null) {
            return null;
        } else if (numbers.length == 1) {
            Node leaf = new Node(numbers[0]);
            return leaf;
        }
        int middleIndex = numbers.length / 2;
        Node currentNode = new Node(numbers[middleIndex]);
        currentNode.setLeftChild(minimalTree(sliceArray(0, middleIndex - 1, numbers)));
        currentNode.setRightChild(minimalTree(sliceArray(middleIndex + 1, numbers.length - 1, numbers)));
        return currentNode;
    }

    private static Integer[] sliceArray(int start, int end, Integer[] arr) {
        int arraySize = (end - start) + 1;
        if (arraySize == 0) {
            return null;
        }
        Integer[] newArray = new Integer[arraySize];
        for (int i = 0; i < newArray.length; i++) {
            newArray[i] = arr[i + start];
        }
        return newArray;
    }

}
