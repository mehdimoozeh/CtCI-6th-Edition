package helper;

public class ENode<T> {
    private T data;
    private ENode<T> left;
    private ENode<T> right;
    private ENode<T> parent;

    public ENode(T data) {
        this.data = data;
        parent = null;
        left = null;
        right = null;
    }

    public T getData() {
        return data;
    }

    public ENode<T> getLeft() {
        return left;
    }

    public void setLeft(ENode<T> node) {
        left = node;
        if (left != null) {
            left.parent = this;
        }
    }

    public ENode<T> getRight() {
        return right;
    }

    public void setRight(ENode<T> node) {
        right = node;
        if (right != null) {
            right.parent = this;
        }
    }

    public static boolean isRoot(ENode root) {
        return root.parent == null;
    }

    public static boolean isLeaf(ENode node) {
        return node.left != null || node.right != null;
    }

    public static void inOrderTraverse(ENode node) {
        if (node == null) return;
        inOrderTraverse(node.left);
        System.out.print(node.data + " ");
        inOrderTraverse(node.right);
    }

    public void preOrderTraverse(ENode node) {
        if (node == null) return;
        System.out.print(node.data + " ");
        preOrderTraverse(node.left);
        preOrderTraverse(node.right);
    }

    public void postOrderTraverse(ENode node) {
        if (node == null) return;
        postOrderTraverse(node.left);
        postOrderTraverse(node.right);
        System.out.print(node.data + " ");
    }

}
