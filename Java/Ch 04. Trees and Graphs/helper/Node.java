package helper;

public class Node<T> {
    private T data;
    private Node<T> left;
    private Node<T> right;
    private Node<T> parent;

    public Node(T data) {
        this.data = data;
        this.parent = null;
        this.left = null;
        this.right = null;
    }

    public T getData() {
        return data;
    }

    public void setLeftChild(Node<T> node) {
        this.left = node;
        if (left != null) {
            this.left.parent = this;
        }
    }

    public void setRightChild(Node<T> node) {
        this.right = node;
        if (right != null) {
            this.right.parent = this;
        }
    }

    public boolean isRoot(Node<T> root) {
        return root.parent == null;
    }

    public boolean isLeaf(Node<T> node) {
        return node.left != null || node.right != null;
    }

    public void inOrderTraversal(Node<T> node) {
        if (node == null) {
            return;
        }
        inOrderTraversal(node.left);
        System.out.print(node.data + " ");
        inOrderTraversal(node.right);
    }

    public void preOrderTraversal(Node<T> node) {
        if (node == null) {
            return;
        }
        System.out.print(node.data + " ");
        preOrderTraversal(node.left);
        preOrderTraversal(node.right);
    }

    public void postOrderTraversal(Node<T> node) {
        if (node == null) {
            return;
        }
        postOrderTraversal(node.left);
        postOrderTraversal(node.right);
        System.out.print(node.data + " ");
    }

}
