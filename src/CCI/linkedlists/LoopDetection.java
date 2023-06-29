package CCI.linkedlists;

import common.ListNode;

import java.util.HashSet;

public class LoopDetection {
    private static ListNode findFirst(ListNode node){
        HashSet<ListNode> set = new HashSet<>();
        while (node != null){
            if (set.contains(node) ) return node;
            else
                set.add(node);
            node = node.next;
        }
        return null;
    }
    public static void main(String[] args){
        ListNode one = new ListNode(1);
        ListNode two = new ListNode(2);
        ListNode three = new ListNode(3);
        ListNode four = new ListNode(4);
        ListNode five = new ListNode(5);
        ListNode six = new ListNode(7);
        one.next = two;
        two.next = three;
        three.next = four;
        four.next = five;
        five.next = six;
        six.next = one;
        ListNode result = findFirst(three);
    }
}
