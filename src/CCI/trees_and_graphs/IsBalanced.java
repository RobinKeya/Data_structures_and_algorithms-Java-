package CCI.trees_and_graphs;

import common.TreeNode;

//write a function to check if a tree is balanced.
public class IsBalanced {
    private static boolean isBalance(TreeNode root){
        return checkHeight(root) != Integer.MIN_VALUE;
    }
    private static int checkHeight(TreeNode node){
        if (node == null) return -1;
        int leftHeight = checkHeight(node.left);
        if (leftHeight== Integer.MIN_VALUE) return Integer.MIN_VALUE;
        int rightHeight = checkHeight(node.right);
        if (rightHeight == Integer.MIN_VALUE)return  Integer.MIN_VALUE;

        int heightDiff = leftHeight - rightHeight;
        if (Math.abs(heightDiff)>0){
            return Integer.MIN_VALUE;
        }else
            return Math.max(leftHeight,rightHeight)+1;

    }
    public static void main(String[]args){
        TreeNode root = new TreeNode(5);
        TreeNode three = new TreeNode(3);
        TreeNode four = new TreeNode(2);
        TreeNode five = new TreeNode(4);
        TreeNode six = new TreeNode(7);
        TreeNode seven = new TreeNode(6);
        TreeNode eight = new TreeNode(8);
        TreeNode nine = new TreeNode(9);
        TreeNode ten = new TreeNode(10);
        root.left = three;
        root.right = six;
        three.left = four;
        three.right = five;
        six.left = seven;
        six.right = eight;
        four.left = nine;
        nine.left = ten;
        boolean results = isBalance(root);

    }
}
