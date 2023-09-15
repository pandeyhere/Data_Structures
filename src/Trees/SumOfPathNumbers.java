package Trees;

public class SumOfPathNumbers {

    public static int SumOfPathNumbers(BinaryTreeNode root){
        return findSumOfAllPaths(root,0);
    }

    public static int findSumOfAllPaths(BinaryTreeNode currentNode, int pathSum){

        if(currentNode == null)
                return 0;

        pathSum = 10*pathSum + currentNode.data;

        if(currentNode.left == null && currentNode.right == null)
            return pathSum;

        return findSumOfAllPaths(currentNode.left,pathSum) + findSumOfAllPaths(currentNode.right,pathSum);

    }
    public static void main(String[] args) {
        BinaryTreeNode root = new BinaryTreeNode(1);
        root.left = new BinaryTreeNode(0);
        root.right = new BinaryTreeNode(1);
        root.left.left = new BinaryTreeNode(1);
        root.right.left = new BinaryTreeNode(6);
        root.right.right = new BinaryTreeNode(5);
        System.out.println("Total Sum of Path Numbers: " +
                SumOfPathNumbers.SumOfPathNumbers(root));
    }
}
