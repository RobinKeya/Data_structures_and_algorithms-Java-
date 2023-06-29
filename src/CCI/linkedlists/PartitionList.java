package CCI.linkedlists;

import common.ListNode;

import java.util.List;

//code to partition a linked list around a value x such that all nodes with values less than x comes before the
// nodes with values more than or equal to x
public class PartitionList {
    private static ListNode partitionList(ListNode head, int value){
        ListNode startNode = null;
        ListNode tempHead = startNode;
        ListNode startOfGreaterThanValue = null;

        while (head != null){
            ListNode node = head.next;
            ListNode data = head;
            head.next = null;
            if (data.data < value){
                startNode.next = data;
                startNode = startNode.next;
            }else {
                startOfGreaterThanValue.next = data;
                startOfGreaterThanValue = startOfGreaterThanValue.next;
            }
            head = node;
        }
        startNode.next = startOfGreaterThanValue.next;
        return tempHead.next;
    }

    public static void main(String[] args){
        ListNode one = new ListNode(3);
        ListNode two = new ListNode(5);
        ListNode three = new ListNode(8);
        ListNode four = new ListNode(5);
        ListNode five = new ListNode(10);
        ListNode six = new ListNode(2);
        ListNode seven = new ListNode(1);
        one.next = two;
        two.next = three;
        three.next = four;
        four.next = five;
        five.next = six;
        six.next = seven;

        ListNode result = partitionList(one, 5);
    }
}
