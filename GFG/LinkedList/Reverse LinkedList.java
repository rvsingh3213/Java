

//https://practice.geeksforgeeks.org/problems/reverse-a-linked-list/1/

// reverse linked list iterative method


class ReverseLL
{
   
    Node reverseList(Node head)
    {
        Node n=null; //n for next node
        Node curr=head;
        Node prev=null;
        
        while(curr!=null)
        {   
            n=curr.next;
            curr.next=prev;
            prev=curr;
            curr=n;
        }
        return prev;
    }
}