package merge_k_sorted_list;

import common.ListNode;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class Solution {
    private ListNode mergeKSortedList(List<ListNode> list){
        PriorityQueue<ListNode> queue = new PriorityQueue<>((a,b)->a.data-b.data);
        ListNode dummyHead = new ListNode(0);
        ListNode iterator = dummyHead;

        for (ListNode lis: list){
            if (lis !=null){
                queue.add(lis);
            }
        }
        while (!queue.isEmpty()){
            ListNode node = queue.poll();
            iterator.next = node;
            iterator = iterator.next;
            if (node.next !=null){
                queue.add(node.next);
            }

        }
        return dummyHead.next;
    }

    public static void main(String[] args){
        Solution obj = new Solution();
        ListNode nine = new ListNode(4);
        ListNode seven = new ListNode(5);
        ListNode five = new ListNode(8);
        ListNode four = new ListNode(2);
        ListNode fiv = new ListNode(6);
        ListNode two = new ListNode(12);
        nine.next = seven;
        seven.next = five;
        four.next = fiv;
        fiv.next = two;

        List<ListNode> ls = new ArrayList<>();
        ls.add(nine);
        ls.add(four);
        ListNode result = obj.mergeKSortedList(ls);
    }
}
