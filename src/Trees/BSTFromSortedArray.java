package Trees;

public class BSTFromSortedArray {

    public static void main(String[] args) {

        int[] a = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

        BinaryTreeNode head = transformIntoBST(a, 0, a.length - 1);

        traverseTree(head);

    }

    private static void traverseTree(BinaryTreeNode head) {
        if (head == null) {
            return;
        }
        traverseTree(head.left);
        System.out.println(head.data);
        traverseTree(head.right);
    }

    private static BinaryTreeNode transformIntoBST(int[] a, int low, int high) {

        if (a == null || a.length == 0) {
            return null;
        }

        if (low > high) {
            return null;
        }

        int middle = low + (high - low) / 2;

        BinaryTreeNode head = new BinaryTreeNode(a[middle], transformIntoBST(a, low, middle - 1),
                transformIntoBST(a, middle + 1, high));

        return head;

    }

}
