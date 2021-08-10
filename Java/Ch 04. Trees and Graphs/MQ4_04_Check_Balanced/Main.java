package MQ4_04_Check_Balanced;

import helper.ENode;

public class Main {
    public static void main(String args[]) {
        ENode root = new ENode(1);
        ENode left = new ENode(2);
        ENode right = new ENode(3);

        root.setLeft(left);
        root.setRight(right);

        ENode left1 = new ENode(4);
        left.setLeft(left1);

        /*ENode left2 = new ENode(5);
        left1.setLeft(left2);*/

        // int maxDepth = maxDepth(root);
        int maxDepth = checkHeight(root);
        System.out.println(maxDepth);
    }

    private static int maxDepth(ENode node) {
        if (node == null) return -1;
        return Math.max(maxDepth(node.getLeft()), maxDepth(node.getRight())) + 1;
    }

    private static int checkHeight(ENode root) {
        if (root == null) return -1;
        int leftHeight = checkHeight(root.getLeft());
        if (leftHeight == Integer.MIN_VALUE) return Integer.MIN_VALUE;

        int rightHeight = checkHeight(root.getRight());
        if (rightHeight == Integer.MIN_VALUE) return Integer.MIN_VALUE;

        int heightDiff = leftHeight - rightHeight;
        if (Math.abs(heightDiff) > 1) {
            return Integer.MIN_VALUE;
        } else {
            return Math.max(leftHeight, rightHeight) + 1;
        }
    }
}
