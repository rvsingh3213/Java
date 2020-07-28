
//https://practice.geeksforgeeks.org/problems/lowest-common-ancestor-in-a-binary-tree/1
//Lowest Common Ancestor in a Binary Tree



class Tree
{


	Node lca(Node root, int n1,int n2)
	{
		if(root.data>Math.max(n1,n2))
		return lca(root.left,n1,n2);
		
		else if(root.data<Math.min(n1,n2))
		return lca(root.right,n1,n2);
		
		return root;
	}
}
