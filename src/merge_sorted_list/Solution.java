package merge_sorted_list;

public class Solution {
    private ListNode mergeList(ListNode l1, ListNode l2){
        ListNode dummyList = new ListNode(0);
        ListNode p = dummyList;

        while (l1 != null && l2 !=null){
            if (l1.data < l2.data){
                p.next = l1;
                l1 = l1.next;
            }else {
                p.next = l2;
                l2= l2.next;
            }

            p= p.next;
        }
        if (l1 != null) p.next = l1;
        if (l2 != null) p.next = l2;

        return dummyList.next;
    }
}
