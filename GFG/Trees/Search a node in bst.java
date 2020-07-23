

//https://practice.geeksforgeeks.org/problems/search-a-node-in-bst/1


class BST
{
    boolean search(Node root, int x)
    {
	  //  Node node=null;
	    boolean flag=false;
	    
	    if(root.data==x)
	    return true;
	    
	   Node parent=null,current=root;
	   
	   while(current!=null)
	   {
	      if(current.data==x)
	      {
	          flag=true;
	          return flag;
	      }
	      
	      if(current.data<x)
	        current=current.right;
	      else
	        current=current.left;
	   }
	   
	   return flag;
	   
	       
    }
}
