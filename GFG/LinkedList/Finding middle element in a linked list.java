

//https://practice.geeksforgeeks.org/problems/finding-middle-element-in-a-linked-list/1/



class Solution
{
    int getMiddle(Node head)
    {   if(head==null)
        return -1;
         int N=1;
         
        Node n=head;
        while(n.next!=null)
        {
            N++; n=n.next;
        }
        int find;
        //if(n%2==0)
        find= N/2 +1;
        
        n=head;
        int count=1;
        while(count<find)
        {
            n=n.next;
            count++;
        }
        return n.data;
        
        
        
    }
}