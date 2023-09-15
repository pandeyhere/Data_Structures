package Trees;

public class BinaryTreeNode {
    public BinaryTreeNode(int data) {
        this.data = data;
    }

    int data;
    BinaryTreeNode left;
    BinaryTreeNode right;

    BinaryTreeNode(int data, BinaryTreeNode left, BinaryTreeNode right) {
        this.data = data;
        this.left = left;
        this.right = right;
    }

}
