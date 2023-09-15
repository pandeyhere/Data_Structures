package Trees;

import ArraysAndStrings.TreeNode;

public class PathWithAGivenSequence {

    public static boolean findPathWithSequence(BinaryTreeNode root, int[] sequence){
        return findPath(root,sequence,0);
    }

    private static boolean findPath(BinaryTreeNode currentNode, int[] sequence, int sequenceIndex){

        if(currentNode == null)
            return false;

        if(sequenceIndex >= sequence.length || currentNode.data != sequence[sequenceIndex])
            return false;

        if(currentNode.left == null && currentNode.right == null && sequenceIndex == sequence.length-1)
            return true;

        return findPath(currentNode.left,sequence,sequenceIndex+1) || findPath(currentNode.right,sequence,sequenceIndex+1);

    }

    public static void main(String[] args) {
        BinaryTreeNode root = new BinaryTreeNode(1);
        root.left = new BinaryTreeNode(0);
        root.right = new BinaryTreeNode(1);
        root.left.left = new BinaryTreeNode(1);
        root.right.left = new BinaryTreeNode(6);
        root.right.right = new BinaryTreeNode(5);

        System.out.println("Tree has path sequence: " +
                PathWithAGivenSequence.findPathWithSequence(root, new int[] { 1, 0, 7 }));
        System.out.println("Tree has path sequence: " +
                PathWithAGivenSequence.findPathWithSequence(root, new int[] { 1, 1, 6 }));
    }

}
