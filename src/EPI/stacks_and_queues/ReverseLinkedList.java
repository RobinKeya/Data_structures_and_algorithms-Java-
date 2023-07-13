package EPI.stacks_and_queues;

import common.ListNode;

import java.util.List;
import java.util.Stack;

//code to reverse linked list using a stack
public class ReverseLinkedList {
    private static ListNode reverseList(ListNode head){
        Stack<ListNode> stack = new Stack<>();
        ListNode result = new ListNode();
        ListNode tempHead = result;
        while (head != null){
            stack.push(head);
            //System.out.println(head.data);
            head = head.next;
        }

        while (!stack.isEmpty()){
            result.next = new ListNode(stack.pop().data);
            //System.out.println(result.next.data);
            result = result.next;
        }
        return tempHead.next;
    }
    public static void main(String[] args){
        ListNode one = new ListNode(1);
        ListNode two = new ListNode(2);
        ListNode three= new ListNode(3);
        one.next = two; two.next = three;
        System.out.println(reverseList(one).data);
    }
}
