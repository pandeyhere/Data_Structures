package Trees;

public class LeftRightViewTree {
    static int maxLevelForLeftView = 0;
    static int maxLevelForRightView = 0;
    static int maxLevelForOutline = 1;

    public static void main(String[] args) {
        BinaryTreeNode leaf1 = new BinaryTreeNode(4, null, null);
        BinaryTreeNode leaf2 = new BinaryTreeNode(5, null, null);
        BinaryTreeNode leaf3 = new BinaryTreeNode(6, null, null);
        BinaryTreeNode leaf4 = new BinaryTreeNode(7, null, null);
        BinaryTreeNode child1 = new BinaryTreeNode(2, leaf1, leaf2);
        BinaryTreeNode child2 = new BinaryTreeNode(3, leaf3, leaf4);
        BinaryTreeNode root1 = new BinaryTreeNode(1, child1, child2);
        printLeftView(root1, 1);
        System.out.println("----------------");
        printRightView(root1, 1);

    }

    private static void printLeftView(BinaryTreeNode root, int level) {
        if (root == null) {
            return;
        }

        if (maxLevelForLeftView < level) {
            System.out.println(root.data);
            maxLevelForLeftView = level;
        }
        printLeftView(root.left, level + 1);

        printLeftView(root.right, level + 1);
    }

    private static void printRightView(BinaryTreeNode root, int level) {
        if (root == null) {
            return;
        }

        if (maxLevelForRightView < level) {
            System.out.println(root.data);
            maxLevelForRightView = level;
        }
        printRightView(root.right, level + 1);
        printRightView(root.left, level + 1);
    }

}
