package Trees;

public class KthLargestKey {

    public static void main(String[] args) {

        BinaryTreeNode leaf1 = new BinaryTreeNode(4, null, null);
        BinaryTreeNode leaf2 = new BinaryTreeNode(5, null, null);
        BinaryTreeNode leaf3 = new BinaryTreeNode(6, null, null);
        BinaryTreeNode leaf4 = new BinaryTreeNode(7, null, null);
        BinaryTreeNode child1 = new BinaryTreeNode(2, leaf1, leaf2);
        BinaryTreeNode child2 = new BinaryTreeNode(3, leaf3, leaf4);
        BinaryTreeNode root1 = new BinaryTreeNode(1, child1, child2);
        kthLargestKey(root1, 2);
    }

    private static void kthLargestKey(BinaryTreeNode root1, int i) {
        if (root1 == null) {
            return;
        }

        kthLargestKey(root1.right, i--);

        if (i == 0) {
            System.out.println(root1.data);
            return;
        }
        kthLargestKey(root1.left, i--);

    }

}
