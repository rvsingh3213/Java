

//https://practice.geeksforgeeks.org/problems/rotate-a-linked-list/1/

//Rotate a Linked list

class Rotate{
    // This function should rotate list counter-
    // clockwise by k and return head node
    static Node rotate(Node head,int k)
		{
			Node h=head;
			int count=1; 
			Node n=head;
       
			while(count!=k  && n!=null)
			{
				n=n.next;				
				count++;
			}
			if(n.next==null)
				return head;
			
			head=n.next;
			n.next=null;
			
			n=head;
			while(n.next!=null)
			{
				n=n.next;
			}
			n.next=h;
			
			return head;
       
    
		}
    
}
