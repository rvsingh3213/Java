

//https://leetcode.com/problems/rotate-list/submissions/
// 61 rotate list

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
    public ListNode rotateRight(ListNode head, int k) {
        
        
        
        
        if( (head==null  || k==0) || (head.next==null)  )
				return head;
			
			ListNode n=head;
			ListNode h=head;
			ListNode prev=null;
			int count=1;
			while(n.next!=null)
			{
				count++;
				prev=n;
				n=n.next;
			}			
			if(count<k)
			{  
			   k=k%count; 
			}
			
			if(k==0 || k==count)
			return head;
			
			n=head;
			
			k=count-k;
			
			count=1;
			
			while(count!=k && n!=null)
			{
				n=n.next;
				count++;
			}
			head=n.next;
			n.next=null;
			
			n=head;
			while(n.next!=null)
			{
				n=n.next;
			}
			n.next=h;
			
			
			return head;
			
			
		
        
    
        
    }
}