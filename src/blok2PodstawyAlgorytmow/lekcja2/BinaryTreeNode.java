package blok2PodstawyAlgorytmow.lekcja2;



public class BinaryTreeNode<T> {
    private BinaryTreeNode parent;
    private BinaryTreeNode left;
    private BinaryTreeNode right;
    private T data;

    public BinaryTreeNode(T data) {
        this.data = data;
    }

    public void setParent(BinaryTreeNode parent) {
        this.parent = parent;
    }

    public void addLeftChild(BinaryTreeNode node) {
        node.setParent(this);
        left = node;
    }

    public void addRightChild(BinaryTreeNode node) {
        node.setParent(this);
        right = node;
    }

    public T getData() {
        return data;
    }

    public BinaryTreeNode getLeft() {
        return left;
    }

    public BinaryTreeNode getRight() {
        return right;
    }

    @Override
    public String toString() {
        return data.toString();
    }
}
