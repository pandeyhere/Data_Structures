package Trees;

public class PrintPathsWithSumOfBinaryTree {

    public static void main(String[] args) {

        // Tree #1

        BinaryTreeNode leaf1 = new BinaryTreeNode(4, null, null);
        BinaryTreeNode leaf2 = new BinaryTreeNode(5, null, null);
        BinaryTreeNode leaf3 = new BinaryTreeNode(6, null, null);
        BinaryTreeNode leaf4 = new BinaryTreeNode(7, null, null);
        BinaryTreeNode child1 = new BinaryTreeNode(2, leaf1, leaf2);
        BinaryTreeNode child2 = new BinaryTreeNode(3, leaf3, leaf4);
        BinaryTreeNode root1 = new BinaryTreeNode(1, child1, child2);

        printPaths(root1, 8);

    }

    private static void printPaths(BinaryTreeNode root, int sum) {
        int[] path = new int[256];
        printPaths(root, path, 0, sum, 0);
    }

    private static void printPaths(BinaryTreeNode root, int[] path, int pathLen, int sum, int total) {
        if (root == null) {
            return;
        }
        path[pathLen] = root.data;
        total += root.data;
        pathLen++;

        if (root.left == null && root.right == null) {
            if (total == sum) {
                printArray(path, pathLen);
            }
            total = 0;
        } else {
            printPaths(root.left, path, pathLen, sum, total);
            printPaths(root.right, path, pathLen, sum, total);
        }

    }

    private static void printArray(int[] path, int pathLen) {
        for (int i = 0; i < pathLen; i++) {
            System.out.print(path[i] + "");
        }
        System.out.println();
    }

}
