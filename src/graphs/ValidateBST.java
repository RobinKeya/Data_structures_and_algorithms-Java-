package graphs;

import common.TreeNode;

//implement a function to check if a binary tree is a binary search three
public class ValidateBST {
    private boolean isValidBST(TreeNode root){
        int data = root.data;
        int leftData = root.left.data;
        int rightData = root.right.data;

        if (leftData <= data && rightData > data){
            isValidBST(root.left);
            isValidBST(root.right);
        }else {
            return false;
        }

        return true;
    }
}
