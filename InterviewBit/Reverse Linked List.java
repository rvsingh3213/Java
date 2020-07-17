

//www.interviewbit.com/problems/reverse-linked-list/

//Reverse Linked List



public class Solution {
    public ListNode reverseList(ListNode A) {
        
        ListNode n=null; //n for next node
        ListNode curr=A;
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
