

//https://leetcode.com/problems/linked-list-cycle/solution/




public class Solution {
    public boolean hasCycle(ListNode head) {
        
        if(head==null)
            return false;
        HashSet<ListNode> st=new HashSet<>();
        
        ListNode n=head;
        boolean flag=false;
        
        while(n!=null)
        {
            if(st.contains(n))
            {
               return true;
            }
            else
                st.add(n);
            
            n=n.next;
        }
     
        return flag;
    }
}