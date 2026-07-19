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
    public ListNode reverseKGroup(ListNode head, int k) {

        if(head == null || head.next == null)return head;

        ListNode temp = head;
        ListNode prev = new ListNode(-1);
        prev.next = head;
        ListNode ans = prev;

        while(temp != null)
        {
            ListNode trav = temp;
            for(int i=0;(i<k-1 && trav!=null);i++)
            {
                trav = trav.next;
            }
            if(trav == null )break;
            ListNode y = trav.next;
            
            trav.next = null;
            prev.next = null;

            ListNode rev = reverse(temp);
            ListNode tail = getTail(rev);
            prev.next = rev;
            tail.next = y;
            
            temp = y;
            prev = tail;
        }

        return ans.next;
        
    }

    public ListNode getTail(ListNode head)
    {
        ListNode curr = head;
        ListNode prev = head;

        while(curr != null)
        {
            prev = curr;
            curr = curr.next;
        }
        return prev;
    }


    public ListNode reverse(ListNode head)
    {
        ListNode curr = head;
        ListNode prev = null;
        ListNode nxt = null;

        while(curr != null)
        {
            nxt = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nxt;
        }
        return prev;
    }
}
