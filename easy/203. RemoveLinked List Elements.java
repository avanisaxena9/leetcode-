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
    public ListNode removeElements(ListNode head, int val) {
        while(head!= null && head.val == val) head = head.next;
        if(head == null) return head;

        ListNode newhead = head;
        while(head!=null){
            ListNode dum = head.next;
            while( dum!= null && dum.val == val){
                head.next = dum.next;
                dum = head.next;
            }
            head = dum;
        }
        return newhead;

    }
}
