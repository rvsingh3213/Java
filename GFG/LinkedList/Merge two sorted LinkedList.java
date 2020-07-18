

//https://practice.geeksforgeeks.org/problems/merge-two-sorted-linked-lists/1

// merge two sorted LinkedList

class Solution {
    public ListNode mergeTwoLists(ListNode A, ListNode B) {
        
        
          ListNode dummy=new ListNode(0);
        
        ListNode tail=dummy;
        
        while(true)
        {
            
            if(A==null)
            {
                tail.next=B;
                break;
            }
            if(B==null)
            {
                tail.next=A;
                break;
                
            }
            
            
            if(A.val<=B.val)
            {
                tail.next=A;
                A=A.next;
            }
            else
            {
                tail.next=B;
                B=B.next;
            }
            
            tail=tail.next;
            
        }
        
        return dummy.next;
        
        
        
    }
}