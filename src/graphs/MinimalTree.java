package graphs;

import com.sun.source.tree.Tree;

public class MinimalTree {
    private class TreeNode{
        int data;
        TreeNode left;
        TreeNode right;
        public TreeNode(int data){
            this.data = data;
        }
    }
    private TreeNode createMinimalBST(int[] nums) {
        return createMinimalBST(nums, 0, nums.length - 1);
    }

    private TreeNode createMinimalBST(int[] nums, int left, int right){
        if (left> right) return null;
        int mid = (left+right)/2;
        TreeNode root = new TreeNode(nums[mid]);
        root.left = createMinimalBST(nums, left, mid-1);
        root.right = createMinimalBST(nums, mid+1, right);
        return root;
    }

    public static void main(String[] args){
        MinimalTree obj = new MinimalTree();
        obj.createMinimalBST(new int[]{1,2,3,4,5,6,7});
    }
}
