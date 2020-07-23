

//https://leetcode.com/problems/diameter-of-binary-tree/
//543. Diameter of Binary Tree



class Solution {
 
    static int height(TreeNode root)
	{ 
		if(root==null)
			return 0;
      /*  if(root.left==null && root.right==null)
            return 1;
		*/
		if(root.left==null)
			return 1+height(root.right);
		
		if(root.right==null)
			return 1+height(root.left);
		
		return 1+Math.max(height(root.left),height(root.right));
		
	}
	
	public int diameterOfBinaryTree(TreeNode root) {
        
		if(root==null)
			return 0;
        if(root.left==null && root.right==null)
            return 0;
		
		int leftHeight=height(root.left);
		int rightHeight=height(root.right);
                
		
		
		//now find max diameterOfBinaryTree of left and right side
		
		int Ldiameter=diameterOfBinaryTree(root.left);
		int Rdiameter=diameterOfBinaryTree(root.right);
		
        // (1+leftHeight+rightHeight) then it will return diamter where it requires nodes
        // now in this it requires edges
		return Math.max(leftHeight+rightHeight,Math.max(Ldiameter,Rdiameter));
        
       
    }
}