


https://www.interviewbit.com/problems/reverse-linked-list/




public class Solution {
    public ListNode reverseList(ListNode A) {
        
       if(A==null || A.next==null)
       {
           return A;
       }
       
       ListNode listHead=reverseList(A.next);
       
       A.next.next=A;
       A.next=null;
       
       return listHead;
    }
}