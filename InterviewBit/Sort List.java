

//https://www.interviewbit.com/problems/sort-list/#


//Sort List

/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
    
    static ListNode mergeSortedList(ListNode A,ListNode B)
    {
        ListNode result=null;
        
        if(A==null)
            return B;
        
        if(B==null)
            return A;
        
        if(A.val<=B.val)
        {
            result=A;
            A.next=mergeSortedList(A.next,B);
        }
        if(B.val<A.val)
        {
            result=B;
            B.next=mergeSortedList(A,B.next);
        }
        
        return result;
        
        
    }
    
    public ListNode sortList(ListNode head) {
        
        if(head==null || head.next==null)
        return head;
        
        
        ListNode middle=findMiddle(head);
        
        ListNode middleNext=middle.next;
        
        middle.next=null;
        
        ListNode left=sortList(head);
        ListNode right=sortList(middleNext);
        
        ListNode result=mergeSortedList(left,right); // it will merge two sorted LLists


        return result;
    }
    
    static ListNode findMiddle(ListNode h)
    {   
        if(h==null)
        return h;
        ListNode fast=h;
        ListNode slow=h;
        
        while(fast.next!=null && fast.next.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }
        
        return slow;
    }
}
