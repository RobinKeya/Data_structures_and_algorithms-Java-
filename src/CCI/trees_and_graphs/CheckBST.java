package CCI.trees_and_graphs;

import com.sun.source.tree.Tree;
import common.TreeNode;

//Given a binary tree, write code to check if its a BST
public class CheckBST {
    private static boolean checkBST(TreeNode node){
        return checkBST(node, null, null);
    }
    private static boolean checkBST(TreeNode node, Integer min, Integer max){
        if (node == null) return true;
        if((min != null && node.data <= min) || (max != null && node.data > max)){
            return false;
        }
        if (!checkBST(node, min, node.data) || !checkBST(node, node.data, max)){
            return false;
        }
        return true;
    }
}
