

//https://www.interviewbit.com/problems/rotate-list/#

//Rotate List


/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
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
				
				if(k==0)
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
