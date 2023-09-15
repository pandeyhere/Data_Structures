package Trees;

public class SubtreeOfAnotherTree {

    public static void main(String[] args) {
        BinaryTreeNode leaf1 = new BinaryTreeNode(4, null, null);
        BinaryTreeNode leaf2 = new BinaryTreeNode(5, null, null);
        BinaryTreeNode leaf3 = new BinaryTreeNode(6, null, null);
        BinaryTreeNode leaf4 = new BinaryTreeNode(7, null, null);
        BinaryTreeNode child1 = new BinaryTreeNode(2, leaf1, leaf2);
        BinaryTreeNode child2 = new BinaryTreeNode(3, leaf3, leaf4);
        BinaryTreeNode root1 = new BinaryTreeNode(1, child1, child2);

        BinaryTreeNode child20 = new BinaryTreeNode(5, null, null);
        BinaryTreeNode child10 = new BinaryTreeNode(4, null, null);
        BinaryTreeNode root10 = new BinaryTreeNode(2, child10, child20);

        boolean answer = subtreeOfAnotherTree(root1, root10);

        System.out.println(answer);
    }

    private static boolean subtreeOfAnotherTree(BinaryTreeNode s, BinaryTreeNode t) {
        if (s == null) {
            return false;
        } else if (isSameTree(s, t)) {
            return true;
        } else {
            return subtreeOfAnotherTree(s.left, t) || subtreeOfAnotherTree(s.right, t);
        }

    }

    private static boolean isSameTree(BinaryTreeNode s, BinaryTreeNode t) {
        if (s == null || t == null) {
            return s == null && t == null;
        } else if (s.data == t.data) {
            return isSameTree(s.left, t.left) && isSameTree(s.right, t.right);
        } else {
            return false;
        }

    }

}
