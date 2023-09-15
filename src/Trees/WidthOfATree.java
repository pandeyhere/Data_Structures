package Trees;

public class WidthOfATree {

    public static void main(String[] args) {

        BinaryTreeNode leaf1 = new BinaryTreeNode(4, null, null);
        BinaryTreeNode leaf2 = new BinaryTreeNode(5, null, null);
        BinaryTreeNode leaf3 = new BinaryTreeNode(6, null, null);
        BinaryTreeNode leaf4 = new BinaryTreeNode(7, null, null);
        BinaryTreeNode child1 = new BinaryTreeNode(2, leaf1, leaf2);
        BinaryTreeNode child2 = new BinaryTreeNode(3, leaf3, leaf4);
        BinaryTreeNode root1 = new BinaryTreeNode(1, child1, child2);

        int maxWidth = 0;
        int maxDepth = DepthOfATree.getMaxDepthOfATree(root1);

        for (int i = 0; i < maxDepth; i++) {
            int tmp = widthAtDepth(root1, i);
            if (tmp > maxWidth)
                maxWidth = tmp;

        }
        System.out.println(maxWidth);
    }

    private static int widthAtDepth(BinaryTreeNode root1, int level) {
        if (root1 == null) {
            return 0;
        } else {
            if (level == 0) {
                return 1;
            } else {
                return widthAtDepth(root1.left, level - 1) + widthAtDepth(root1.right, level - 1);
            }
        }

    }

}
