package Trees;

public class CheckIfTreeIsBalanced {
    static boolean isBal = true;

    public static void main(String[] args) {
        BinaryTreeNode leaf1 = new BinaryTreeNode(4, null, null);
        BinaryTreeNode leaf2 = new BinaryTreeNode(5, null, null);
        BinaryTreeNode leaf3 = new BinaryTreeNode(6, null, null);
        BinaryTreeNode leaf4 = new BinaryTreeNode(7, null, null);
        BinaryTreeNode child1 = new BinaryTreeNode(2, leaf1, leaf2);
        BinaryTreeNode child2 = new BinaryTreeNode(3, leaf3, leaf4);
        BinaryTreeNode root1 = new BinaryTreeNode(1, child1, child2);

        int height = isBalanced(root1);
        System.out.println(height);
        System.out.println(isBal);

    }

    private static int isBalanced(BinaryTreeNode root) {
        if (root == null) {
            return 0;
        }
        int lh = isBalanced(root.left);
        int rh = isBalanced(root.right);

        int gap = Math.abs(lh - rh);
        if (gap > 1) {
            isBal = false;
        }
        int th = Math.max(lh, rh) + 1;
        return th;
    }

}
