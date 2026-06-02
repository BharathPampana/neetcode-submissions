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
    public void reorderList(ListNode head) {

        if(head == null || head.next == null)return;
        

        ListNode slow = head;
        ListNode fast = head;
        ListNode sPrev = head;
        while(fast != null && fast.next != null)
        {
            sPrev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }

        if(sPrev != null)sPrev.next = null;

        ListNode rev = reverse(slow);

        
        ListNode f = head;
        ListNode s = rev;

        // print(f);
        // print(s);

        while(f.next != null)
        {
            ListNode ff = f.next;
            ListNode ss = s.next;
            f.next = s;
            s.next = ff;
            s = ss;
            f = ff;
        }
        f.next = s;
    }

    public ListNode reverse(ListNode head)
    {
        ListNode prev = null;
        ListNode curr = head;
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

    public void print(ListNode head)
    {
        ListNode curr = head;
        while(curr != null)
        {
            System.out.print(curr.val + "->");
            curr = curr.next;
        }
        System.out.print("null");
    }
}
