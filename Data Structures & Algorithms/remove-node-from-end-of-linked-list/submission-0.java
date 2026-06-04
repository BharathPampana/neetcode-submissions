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

        ListNode a = head;
        ListNode b = head;
        
        for(int i=1;i<n;i++)
        {
            a = a.next;
        }
        ListNode prev = null;
        while(a.next!= null)
        {
            prev = b;
            b = b.next;
            a = a.next;
        }

        if(prev == null)return head.next;
    
        prev.next = prev.next.next;
        return head;

    }
}
