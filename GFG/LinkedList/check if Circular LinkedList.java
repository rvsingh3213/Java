

//https://practice.geeksforgeeks.org/problems/circular-linked-list/1


class GfG
{
    boolean isCircular(Node head)
    {
        if(head==null)
        return true; 
	    Node n=head;
	    boolean flag=false;
	    
	    while(n.next!=null)
	    {
	        n=n.next;
	        
	        if(n==head){flag=true; break;}
	        
	    }
	    
	    return flag;
	    
	    
	    
    }
}