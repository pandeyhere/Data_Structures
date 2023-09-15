package Trees;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class CountPathsForASum {

    public static int countPathsWithSum (BinaryTreeNode root, int sum){
        List<Integer> currentPath = new ArrayList<>();
        return countPaths(root,sum,currentPath);
    }

    private static int countPaths(BinaryTreeNode currentNode, int sum, List<Integer> currentPath) {
        if (currentNode == null)
            return 0;

        currentPath.add(currentNode.data);
        int pathCount = 0;
        int pathSum = 0;

        ListIterator<Integer> pathIterator = currentPath.listIterator(currentPath.size());
        while(pathIterator.hasPrevious()){
            pathSum += pathIterator.previous();

            if(pathSum == sum){
                pathCount++;
            }
        }

        pathCount += countPaths(currentNode.left,sum,currentPath);
        pathCount += countPaths(currentNode.right,sum,currentPath);

        currentPath.remove(currentPath.size()-1);

        return  pathCount;
    }

    public static void main(String[] args) {
        BinaryTreeNode root = new BinaryTreeNode(12);
        root.left = new BinaryTreeNode(7);
        root.right = new BinaryTreeNode(1);
        root.left.left = new BinaryTreeNode(4);
        root.right.left = new BinaryTreeNode(10);
        root.right.right = new BinaryTreeNode(5);
        System.out.println("Tree has path: " + CountPathsForASum.countPathsWithSum(root, 11));
        System.out.println("Tree has path: " + CountPathsForASum.countPathsWithSum(root, 23));

    }
}
