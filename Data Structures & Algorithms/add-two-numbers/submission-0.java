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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        
        ListNode head = new ListNode(-100);
        ListNode temp = head;
        
        int carry = 0;
        while(l1 != null || l2 != null)
        {
            int a = 0;
            int b = 0;
            if(l1 != null)a = l1.val;
            if(l2 != null)b = l2.val;

            int sum = a + b + carry;
            if(sum>9){
                sum = sum%10;
                carry = 1;
            }
            else{
                carry = 0;
            }
            
            if(l1 != null){
                l1.val = sum;
                temp.next = l1;
                temp = temp.next;
            }
            else{
                l2.val = sum;
                temp.next = l2;
                temp = temp.next;
            }
            
            if(l1 != null)l1 = l1.next;
            if(l2 != null)l2 = l2.next;
        }
        if(carry == 1){
            ListNode x = new ListNode(carry);
            temp.next = x;
        }
        return head.next;
    }
}
