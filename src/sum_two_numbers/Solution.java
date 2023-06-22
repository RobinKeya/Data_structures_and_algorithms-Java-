package sum_two_numbers;

import common.ListNode;

public class Solution {
    private ListNode addTwoNumbers(ListNode l1, ListNode l2){
        ListNode dummyHead = new ListNode(0);
        ListNode p = dummyHead;
        int carry =0;
        while (l1 !=null || l2 !=null){
            int sum =0;
            if (l1 !=null && l2 ==null){
                sum = l1.data;
                l1 = l1.next;
            }
            else if (l2 != null && l1 == null){
                sum = l2.data;
                l2 = l2.next;
            }
            else {
                sum = l1.data + l2.data;
                l1 = l1.next;
                l2 = l2.next;
            }
            sum += carry;
            carry = sum/10;
            p.next = new ListNode(sum%10);
            p = p.next;
        }
        if (carry >0){
            p.next = new ListNode(carry);
        }
        return dummyHead.next;
    }

    public static void main(String[] args){
        Solution obj = new Solution();
        ListNode nine = new ListNode(9);
        ListNode seven = new ListNode(7);
        ListNode five = new ListNode(5);
        ListNode four = new ListNode(4);
        ListNode fiv = new ListNode(5);
        ListNode two = new ListNode(9);
        nine.next = seven;
        seven.next = five;
        four.next = fiv;
        fiv.next = two;

        ListNode result = obj.addTwoNumbers(nine, four);
    }
}
