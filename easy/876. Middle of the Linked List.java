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
    public ListNode middleNode(ListNode head) {
        int mid = 1;
        ListNode f = head;
        while(f.next!=null){
            f=f.next;
            mid++;
        }
        mid = mid/2;
        while(mid> 0){
            head = head.next;
            mid--;
        }
        return head;

    }
}
