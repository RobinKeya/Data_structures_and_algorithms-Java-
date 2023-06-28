package trees;

import common.TreeNode;

public class TreeTraversal {
    private void inOrderTraversal(TreeNode root){
        inOrderTraversal(root.left);
        System.out.println(root.data);
        inOrderTraversal(root.right);
    }

    private void preOrderTraversal(TreeNode root){
        System.out.println(root.data);
        preOrderTraversal(root.left);
        preOrderTraversal(root.right);
    }

    private void postOrderTraversal(TreeNode root){
        postOrderTraversal(root.left);
        postOrderTraversal(root.right);
        System.out.println(root.data);
    }
}
