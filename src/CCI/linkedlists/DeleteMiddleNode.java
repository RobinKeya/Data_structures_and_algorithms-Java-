package CCI.linkedlists;

import common.ListNode;

public class DeleteMiddleNode {
    private static void deleteMiddleNode(ListNode node){
        if (node == null || node.next == null)return;
        ListNode next = node.next;
        node.data = next.data;
        node.next = next.next;
    }
}
