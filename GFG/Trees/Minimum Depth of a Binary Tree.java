
//https://practice.geeksforgeeks.org/problems/minimum-depth-of-a-binary-tree/1


class Tree
{
	int minDepth(Node root)
	{
	    if(root ==null)
	    return 0;
	    
	    if(root.left==null)
	    return 1+minDepth(root.right);
	    
	    if(root.right==null)
	    return 1+minDepth(root.left);
	    
	    return 1+Math.min(minDepth(root.left),minDepth(root.right));
	    
	}
}