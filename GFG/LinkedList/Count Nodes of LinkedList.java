
//https://practice.geeksforgeeks.org/problems/count-nodes-of-linked-list/1
// this was the required funtion
    public static int getCount(Node head)
    {
        int count=0;
        
        Node n=head;
        while(n!=null)
        {
            count++;
            n=n.next;
        }
        return count;
       
    }