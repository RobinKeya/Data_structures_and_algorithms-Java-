package CCI.linkedlists;

import common.ListNode;

//implement a method to check if a  linked list is a palindrome.
public class Palindrome {
    private static boolean isPalindrome(ListNode head){
        ListNode next;
        ListNode current = head;
        ListNode previous = null;
        while (current != null){
            next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        ListNode newHead = previous;
        System.out.print(newHead.data);

        while (head != null){
            if (head.data != newHead.data){
                return false;
            }
            head = head.next;
            newHead = newHead.next;
        }
        return true;
    }
    public static void main(String[] args){
        ListNode one = new ListNode(7);
        ListNode two = new ListNode(1);
        ListNode three = new ListNode(6);
        ListNode four = new ListNode(6);
        ListNode five = new ListNode(1);
        ListNode six = new ListNode(7);
        one.next = two;
        two.next = three;
        three.next = four;
        four.next = five;
        five.next = six;

        System.out.print(isPalindrome(one));
    }
}
