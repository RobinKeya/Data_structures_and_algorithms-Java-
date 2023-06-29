package CCI.linkedlists;

import common.ListNode;

public class SumList {
    private static ListNode sumList(ListNode first, ListNode second){
        ListNode result = new ListNode();
        ListNode tempHead = result;
        int carry =0;

        while (first != null || second !=null){
            int sum = 0;
            if (first != null && second != null){
                sum += first.data + second.data + carry;
                first = first.next;
                second = second.next;
            } else if (first == null) {
                sum += second.data + carry;
                second = second.next;
            }else {
                sum += first.data + carry;
                first = first.next;
            }

            carry = sum /10;
            result.next = new ListNode(sum%10);
            result = result.next;
        }

        if (carry > 0){
            result.next = new ListNode(1);
        }
        return tempHead.next;
    }

    public static void main(String[] args){
        ListNode one = new ListNode(7);
        ListNode two = new ListNode(1);
        ListNode three = new ListNode(6);
        ListNode four = new ListNode(5);
        ListNode five = new ListNode(9);
        ListNode six = new ListNode(2);
        one.next = two;
        two.next = three;
        four.next = five;
        five.next = six;
        ListNode result = sumList(one, four);
    }
}
