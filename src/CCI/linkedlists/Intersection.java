package CCI.linkedlists;

import common.ListNode;

//given two singly linked lists, determine if the two linked list intersect. Return the intersecting node
public class Intersection {
    private static ListNode findIntersection(ListNode l1, ListNode l2){
        int len1=0, len2 =0;
        ListNode temp1 = l1, temp2 = l2;
        while(temp1.next != null){
            len1++;
            temp1 = temp1.next;
        }
        while (temp2.next != null){
            len2++;
            temp2 = temp2.next;
        }
        if (temp2 != temp1) return  null;
        if (len1 > len2) {
            l1 = moveList(l1, len1-len2);
        }
        else
            l2 = moveList(l2, len2-len1);
        while (l1 != null && l2 != null){
            if (l1 == l2) return l1;
            l1 = l1.next;
            l2 = l2.next;
        }
        return null;
    }
    private static ListNode moveList(ListNode node, int n){
        while(n> 0){
            node = node.next;
            n--;
        }
        return node;
    }
    public static void main(String[]args){
        ListNode two = new ListNode(2);
        ListNode four = new ListNode(4);
        ListNode six = new ListNode(6);
        ListNode eight = new ListNode(8);
        ListNode ten = new ListNode(10);
        ListNode twelve = new ListNode(12);
        ListNode five = new ListNode(5);
        ListNode seven = new ListNode(7);
        two.next = four;
        four.next = six;
        six.next = eight;
        eight.next= ten;
        ten.next = twelve;
        five.next = seven;
        seven.next= eight;
        System.out.println(findIntersection(two,five).data);
    }
}
