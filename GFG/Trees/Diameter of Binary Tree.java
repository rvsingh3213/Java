

//https://practice.geeksforgeeks.org/problems/diameter-of-binary-tree/1

//Diameter of Binary Tree


class Tree {
    /* Complete the function to get diameter of a binary tree */
    int height(Node root)
    {
        if(root==null)
        return 0;
        
        if(root.left==null)
        return 1+height(root.right);
        
        if(root.right==null)
        return 1+height(root.left);
        
        return 1+Math.max(height(root.left),height(root.right));
    }
    
    int diameter(Node root) {
    
    if(root==null)
    return 0;
    
    int LH=height(root.left);
    int RH=height(root.right);
    
    
    int leftDiameter=diameter(root.left);
    int rightDiameter=diameter(root.right);
    // here ading 1 because problem ask for number of nodes in longest path
    return Math.max(1+LH+RH,Math.max(leftDiameter,rightDiameter));
      
    }
}
