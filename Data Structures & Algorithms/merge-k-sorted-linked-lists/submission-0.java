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
    public ListNode mergeKLists(ListNode[] lists) {

        ListNode res = new ListNode(-1001);
        int n = lists.length;
        for(int i = 0;i<n;i++)
        {
            ListNode curr = lists[i];
            merge(res,curr);
        }
        return res.next;
    }

    public void merge(ListNode l1, ListNode l2)
    {
        ListNode temp = new ListNode(0);
        ListNode head = temp;
        ListNode a = l1;
        ListNode b = l2;
        while(a != null && b!= null)
        {
            if(a.val <= b.val){
                temp.next = a;
                temp = a;
                a = a.next;
            }
            else{
                temp.next = b;
                temp = b;
                b = b.next;
            }
        }
        if(a != null)temp.next = a;
        if(b != null)temp.next = b;
        l1 =  head.next;
    }

}
