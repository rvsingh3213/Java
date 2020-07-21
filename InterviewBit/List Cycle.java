

//https://www.interviewbit.com/problems/list-cycle/#

//List cycle

/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode ls=null;
          if(head==null)
            return ls;
        HashSet<ListNode> st=new HashSet<>();
        
        ListNode n=head;
        boolean flag=false;
        
        while(n!=null)
        {
            if(st.contains(n))
            {
              flag=true;
              break;
            }
            else
                st.add(n);
            
            n=n.next;
        }
     
       if(flag)
       return n;
       
       return ls;
    }
}
