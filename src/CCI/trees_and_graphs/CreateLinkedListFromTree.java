package CCI.trees_and_graphs;

import common.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;

//create linked-list from a tree, if the tree has D levels, then D linkedLists
public class CreateLinkedListFromTree {
    private static ArrayList<LinkedList<TreeNode>> createLinkedList(TreeNode root){
        ArrayList<LinkedList<TreeNode>> result = new ArrayList<>();
        LinkedList<TreeNode> current = new LinkedList<>();
        if (root != null){
            current.add(root);
        }
        while (current.size() >0){
            result.add(current);
            LinkedList<TreeNode> parent = current;
            current = new LinkedList<>();
            for (TreeNode tmp : parent){
                if (tmp.left != null){
                    current.add(tmp.left);
                }
                if (tmp.right != null){
                    current.add(tmp.right);
                }
            }
        }
        return result;
    }
}
