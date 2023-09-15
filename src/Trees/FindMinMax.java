package Trees;

public class FindMinMax {

    public static void main(String[] args) {
        BinaryTreeNode leaf1 = new BinaryTreeNode(4, null, null);
        BinaryTreeNode leaf2 = new BinaryTreeNode(5, null, null);
        BinaryTreeNode leaf3 = new BinaryTreeNode(6, null, null);
        BinaryTreeNode leaf4 = new BinaryTreeNode(7, null, null);
        BinaryTreeNode child1 = new BinaryTreeNode(2, leaf1, leaf2);
        BinaryTreeNode child2 = new BinaryTreeNode(3, leaf3, leaf4);
        BinaryTreeNode root1 = new BinaryTreeNode(1, child1, child2);
        int min = findMin(root1);

        int max = findMax(root1);

        System.out.println("Min is: " + String.valueOf(min) + "Max is: " + String.valueOf(max));
    }

    private static int findMax(BinaryTreeNode root1) {
        if (root1 == null) {
            return Integer.MIN_VALUE;
        }

        int rightMax = findMax(root1.right);
        int leftMax = findMax(root1.left);
        return Math.max(root1.data, Math.max(rightMax, leftMax));
    }

    private static int findMin(BinaryTreeNode root1) {
        if (root1 == null) {
            return Integer.MAX_VALUE;
        }

        int rightMin = findMax(root1.right);
        int leftMin = findMax(root1.left);
        return Math.min(root1.data, Math.min(leftMin, rightMin));
    }

}
