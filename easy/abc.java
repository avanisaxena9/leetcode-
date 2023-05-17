/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1 == null) return l2;
        if(l2 == null) return l1;

        ListNode dummy = new ListNode();
        ListNode temp = new ListNode();
        temp = dummy;

        while(l1 != null && l2 != null){
            ListNode dd = new ListNode();
            if(l1.val <= l2.val ){
                dd  = l1;
                l1 = l1.next;

            }

            else if (l2.val < l1.val  ){
                dd = l2;
                l2 = l2.next;
            }
            temp.next = dd;
            temp = temp.next;
            if(l1 == null){
                temp.next = l2;
                break;
            }
            if(l2 == null){
                temp.next = l1;
                break;
            }
        }
        return dummy.next;


    }
}
