

//https://practice.geeksforgeeks.org/problems/check-for-balanced-tree/1
//Check for Balanced Tree

// Time complextiy O(N*N)  and O(N) is also down this solution



class Tree
{
    
     int height(Node root)
     {
         if(root==null) return 0;
         
         return 1+Math.max(height(root.left),height(root.right));
     }
    boolean isBalanced(Node root)
    {
	    if(root==null) return true;
	    
	    int left=height(root.left);
	    int right=height(root.right);
	    
	    
	    return Math.abs(left-right)<=1 && isBalanced(root.left) && isBalanced(root.right);
	    
	    
	    
	    
    }
}
