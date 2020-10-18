

//https://www.interviewbit.com/problems/remove-nth-node-from-list-end/

//Remove Nth Node from List End



public class Solution {
    
    public ListNode removeNthFromEnd(ListNode head, int n){
   
        ListNode node=head;
      int count=0;
      while(node!=null)
      {
          node=node.next;
          count++;
      }
      if(n==1){head=null; return head;}
      if(n>count)
      {
          head=head.next; return head;
      }
     
      n=count-n+1;
      count=1;
      
      ListNode prev=null;
    //  System.out.println("n:"+n);
      node=head;
      while(count<n  )// && node!=null)
      {   prev=node;
          node=node.next;
          count++;
      }
      prev.next=node.next;
      return head;
      
        
    }