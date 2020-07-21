

//https://practice.geeksforgeeks.org/problems/remove-loop-in-linked-list/1/



class solver
{
    public static void removeLoop(Node head){
        // code here
        // remove the loop without losing any nodes
        if(head==null)
        return;
        if(head==head.next)
       { head.next=null;return;}
        
        HashSet<Node> st=new HashSet<>();
        Node n=head;
        Node prev=null;
        while(n!=null)
        {
            if(st.contains(n))
            {
                prev.next=null;
                break;
            }
            else
            {
                st.add(n);
            }
            prev=n;
            n=n.next;
        }
    }
}