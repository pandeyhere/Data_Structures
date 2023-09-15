package Trees;

public class CheckIfBST {

    public static void main(String[] args) {
        BinaryTreeNode leaf1 = new BinaryTreeNode(1, null, null);
        BinaryTreeNode leaf2 = new BinaryTreeNode(3, null, null);
        BinaryTreeNode leaf3 = new BinaryTreeNode(4, null, null);
        BinaryTreeNode leaf4 = new BinaryTreeNode(7, null, null);
        BinaryTreeNode child1 = new BinaryTreeNode(2, leaf1, leaf2);
        BinaryTreeNode child2 = new BinaryTreeNode(6, leaf3, leaf4);
        BinaryTreeNode root1 = new BinaryTreeNode(5, child1, child2);

        boolean result = checkIfBST(root1);
        System.out.println(result);
    }

    private static boolean checkIfBST(BinaryTreeNode root1) {
        if (root1 == null) {
            return true;
        }
        if (root1.left != null && root1.left.data > root1.data) {
            return false;
        }
        if (root1.right != null && root1.right.data < root1.data) {
            return false;
        }
        if (!checkIfBST(root1.left) && !checkIfBST(root1.right)) {
            return false;
        }
        return true;
    }

}
