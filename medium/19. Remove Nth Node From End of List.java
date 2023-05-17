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
    public ListNode removeNthFromEnd(ListNode head, int n) {
       ListNode prev= head;
        int count=1,i=0;
        ListNode counter = head;
        
    while ( counter.next!=null){
        count++;
        counter=counter.next;
    }
        int node = count-n;
        ListNode curr = prev.next;
        
        if(count==n) {
            head=head.next
            }
        else {
            while(i<node-1){
                curr = curr.next;
                prev = prev.next;
                i++;
            }
            prev.next = curr.next;
            curr=prev.next;
        }
        return head;
    }
}

//alternate solution
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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        
        int count = 1;
        ListNode ln = new ListNode();
        ln = head;
        if(ln.next == null) return ln.next;
        
        while(ln.next!= null){
            ln = ln.next;
            count++;
        }
        if(count == n) {
            return head.next;
        }
        count++;
        count = count - n;
        ln = head;
        while(count>2){
            ln = ln.next;
            count--;
        }
        ln.next = ln.next.next;
        // dum = dum.next.next;
        return head;
    }
}
