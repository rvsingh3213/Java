


//148. Sort List
//https://leetcode.com/problems/sort-list/

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
    
    private ListNode findMiddle(ListNode head)
    {
        if(head==null || head.next==null)return head;
        
        ListNode slow=head;
        ListNode fast=head;
        
        while(fast.next!=null && fast.next.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
            
        }
        
        return slow;
    }
    public ListNode sortList(ListNode head) {
        
        if(head==null || head.next==null)return head;
        
        ListNode middle=findMiddle(head);
        
        ListNode midNxt=middle.next;
        middle.next=null;
        
        head=sortList(head);
        
        midNxt=sortList(midNxt);
        
        ListNode result=mergeLL(head,midNxt);
        
        return result;
        
    }
    
    private ListNode mergeLL(ListNode A,ListNode B)
    {
        if(A==null)return B;
        
        if(B==null)return A;
        ListNode result=null;
        if(A.val<=B.val)
        {
            result=A;
            result.next=mergeLL(A.next,B);
        }
        
        if(B.val<A.val)
        {
            result=B;
            result.next=mergeLL(A,B.next);
        }
        
        return result;
        
        
        
        
    }
    
    
}