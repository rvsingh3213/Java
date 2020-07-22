

//https://leetcode.com/problems/remove-nth-node-from-end-of-list/


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
    public ListNode removeNthFromEnd(ListNode head, int k) {
        
        ListNode n=null;
        if(head==null ||head.next==null)
            return n;
        
        n=head;
        
        int count=1;
        
        
        while(n.next!=null)
        {
            n=n.next;
            count++;
            
           
        }
        if(count==k)
            return head.next;
        
        k=count-k;
        count=1;
        n=head;
        //Node prev=null;
        while(count<k)
        {
           n=n.next;
            count++;
        }
        
        n.next=n.next.next;    
        
        
        return head;
        
    }
}	