package EPI.linkedlists;

import common.ListNode;

//given two sorted singly linked list, write program to merge the two linked list, the only thing that the program
// can change is a pointer to the next node.
// l1-> 2->5->7
//l2 -> 3->11
// R -> 2->3->5->7->11
public class MergeSortedList {
    public static ListNode mergeSortedList(ListNode l1, ListNode l2){
        ListNode runner = new ListNode();
        ListNode tempHeader = runner;
        ListNode p1 = l1, p2 = l2;
        while (p1 != null && p2 != null){
            if (p1.data <= p2.data){
                runner.next = p1;
                p1 = p1.next;
            }else {
                runner.next = p2;
                p2 = p2.next;
            }
            runner = runner.next;
        }
        runner.next = p1 != null? p1 : p2;
        return tempHeader.next;
    }
    public static void main(String[]args){
        ListNode one = new ListNode(2);
        ListNode two = new ListNode(5);
        ListNode three = new ListNode(7);
        ListNode four = new ListNode(3);
        ListNode five = new ListNode(11);
        one.next = two;
        two.next = three;
        four.next = five;

        ListNode results = mergeSortedList(one, four);
    }
}
