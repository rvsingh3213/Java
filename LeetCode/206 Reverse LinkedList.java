

//https://leetcode.com/problems/reverse-linked-list/submissions/

//Reverse Linked List



class Solution {
    public ListNode reverseList(ListNode head) {
        
        ListNode n=null; //n for next node
        ListNode curr=head;
        ListNode prev=null;
        
         while(curr!=null)
        {   
            n=curr.next;
            curr.next=prev;
            prev=curr;
            curr=n;
        }
        return prev;
        
    }
}