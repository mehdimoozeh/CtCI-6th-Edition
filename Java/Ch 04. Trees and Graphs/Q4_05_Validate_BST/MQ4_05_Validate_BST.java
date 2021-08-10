package Q4_05_Validate_BST;


import helper.BST;

public class MQ4_05_Validate_BST {
    private static Integer last = null;

    public static void main(String args[]) {
        BST root = new BST(5);
        root.insertNode(3);
        root.insertNode(2);
        root.insertNode(1);
        root.insertNode(4);

        boolean result = validateBST(root);
        System.out.println(result);
    }

    private static boolean validateBST(BST root) {
        if (root == null) return true;

        boolean leftSide = validateBST(root.getLeft());
        if (last != null && root.getVal() <= last) return false;
        last = root.getVal();
        boolean rightSide = validateBST(root.getRight());

        return leftSide && rightSide;
    }
}
