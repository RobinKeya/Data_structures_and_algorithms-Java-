package CCI.trees_and_graphs;

import common.TreeNode;

import java.util.List;

//given a sorted array, write an algorithm that will create a BST with minimal height
public class MinimalTree {
    private static TreeNode createMinimalBST(List<Integer> nums){
        return createMinimalBST(nums, 0, nums.size()-1);

    }
    private static TreeNode createMinimalBST(List<Integer> nums, int left, int right){
        if (right< left) return null ;
        int mid = (left+right)/2;
        TreeNode parent = new TreeNode(mid);
        parent.left = createMinimalBST(nums, left, mid-1);
        parent.right = createMinimalBST(nums, mid+1, right);
        return parent;
    }
}
