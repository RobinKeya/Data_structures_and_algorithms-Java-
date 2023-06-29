package CCI.linkedlists;

import common.ListNode;

import java.util.HashSet;
import java.util.List;

public class RemoveDuplicates {
    private static ListNode removeDuplicates(ListNode head){
        HashSet<Integer> set = new HashSet<>();
        ListNode tempHead = head;
        ListNode previous = null;
        while (head != null){
            if (set.contains(head.data)){
                previous.next = previous.next.next;
            }else {
                set.add(head.data);
                previous = head;

            }
            head = head.next;
        }
        return tempHead;
    }
    public static void main(String[]args){
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
        ListNode result = removeDuplicates(one);
        ListNode res = deleteDuplicates(one);
    }
    //follow up, what if you cannot use additional data structure (Operation in place.)
    private static ListNode deleteDuplicates(ListNode head){
        ListNode tempHead = head;
        ListNode current = head;
        while (current != null){
            ListNode runner = current;
            while (runner.next !=null){
                if (current.data == runner.next.data){
                    runner = runner.next.next;
                }else
                    runner = runner.next;
            }
            current = current.next;
        }
        return tempHead;
    }

}
