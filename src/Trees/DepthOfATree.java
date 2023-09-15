package Trees;

public class DepthOfATree {

    public static void main(String[] args) {
        BinaryTreeNode leaf1 = new BinaryTreeNode(4, null, null);
        BinaryTreeNode leaf2 = new BinaryTreeNode(5, null, null);
        BinaryTreeNode leaf3 = new BinaryTreeNode(6, null, null);
        BinaryTreeNode leaf4 = new BinaryTreeNode(7, null, null);
        BinaryTreeNode child1 = new BinaryTreeNode(2, leaf1, leaf2);
        BinaryTreeNode child2 = new BinaryTreeNode(3, leaf3, leaf4);
        BinaryTreeNode root1 = new BinaryTreeNode(1, child1, child2);

        int depth = getMaxDepthOfATree(root1);
        System.out.println(depth);
    }

    public static int getMaxDepthOfATree(BinaryTreeNode root1) {
        if (root1 == null) {
            return 0;
        }
        int leftDepth = getMaxDepthOfATree(root1.left);
        int rightDepth = getMaxDepthOfATree(root1.right);

        return (leftDepth > rightDepth) ? leftDepth + 1 : rightDepth + 1;
    }

}
