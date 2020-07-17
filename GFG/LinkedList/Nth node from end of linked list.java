

//https://practice.geeksforgeeks.org/problems/nth-node-from-end-of-linked-list/1
//Nth node from end of linked list



class GfG
{
    
    int getNthFromLast(Node head, int n)
    {
    	 Node node=head;
      int count=0;
      while(node!=null)
      {
          node=node.next;
          count++;
      }
     // System.out.println("count:"+count);
      if(count<n)
      {
          return -1;
      }
       //System.out.println("count:"+count);
      n=count-n+1;
      count=1;
    //  System.out.println("n:"+n);
      node=head;
      while(count<n)
      {
          node=node.next;
          count++;
      }
      
      return node.data;
      
      	
    }
}
