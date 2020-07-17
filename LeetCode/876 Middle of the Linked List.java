

//https://leetcode.com/problems/middle-of-the-linked-list/submissions/

//middle of the linked list



class Solution {
    public ListNode middleNode(ListNode head) {
        
        
        ListNode n=head;
        
        int count=1;
        while(n.next!=null)
        {
            n=n.next;
            count++;
        }
        
        
        count=count/2+1;
        int a=1;
        n=head;
        while(a<count)
        {
           n=n.next;
            a++;
        }
        
        return n;
        
    }
}