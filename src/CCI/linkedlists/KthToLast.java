package CCI.linkedlists;


import common.ListNode;

// implement an algorithm to find kth to last in a singly linked list
public class KthToLast {

    private static ListNode findKthToLast(ListNode head, int k){
        ListNode first = head;
        ListNode second = head;
        while (k >= 1){
            second = second.next;
            k--;
        }
        while (second != null){
            first = first.next;
            second = second.next;
        }
        return first;
    }
    public static void main(String[] args){
        ListNode one = new ListNode(1);
        ListNode two = new ListNode(2);
        ListNode three = new ListNode(1);
        ListNode four = new ListNode(4);
        ListNode five = new ListNode(7);
        ListNode six = new ListNode(5);
        ListNode seven = new ListNode(5);
        one.next = two;
        two.next = three;
        three.next = four;
        four.next = five;
        five.next = six;
        six.next = seven;

        ListNode result = findKthToLast(one, 1);
    }
}
