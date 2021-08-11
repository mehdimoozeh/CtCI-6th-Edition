package helper;

public class BST {
    private Integer val;
    private BST left;
    private BST right;
    private BST parent;

    public BST() {
        this.val = null;
        left = null;
        right = null;
        parent = null;
    }

    public BST(int data) {
        this.val = data;
        left = null;
        right = null;
        parent = null;
    }

    public BST findOne(int data) {
        if (data == this.val) return this;
        if (data < this.val && this.left != null) return this.left.findOne(data);
        if (data > this.val && this.right != null) return this.right.findOne(data);
        return null;
    }

    public void insertNode(int data) {
        if (this.val == null) return;
        if (data <= this.val)
            if (this.left == null) {
                this.left = new BST(data);
                this.left.parent = this;
            } else
                this.left.insertNode(data);
        else if (data > this.val)
            if (this.right == null) {
                this.right = new BST(data);
                this.right.parent = this;
            } else
                this.right.insertNode(data);
    }

    public BST getParent() {
        return parent;
    }

    public int getVal() {
        return val;
    }

    public BST getLeft() {
        return left;
    }

    public BST getRight() {
        return right;
    }

    public static boolean isLeaf(BST node) {
        return node.left != null || node.right != null;
    }

    public static void inOrderTraverse(BST node) {
        if (node == null) return;
        inOrderTraverse(node.left);
        System.out.print(node.val + " ");
        inOrderTraverse(node.right);
    }

    public void preOrderTraverse(BST node) {
        if (node == null) return;
        System.out.print(node.val + " ");
        preOrderTraverse(node.left);
        preOrderTraverse(node.right);
    }

    public void postOrderTraverse(BST node) {
        if (node == null) return;
        postOrderTraverse(node.left);
        postOrderTraverse(node.right);
        System.out.print(node.val + " ");
    }

}
