

//https://leetcode.com/problems/balanced-binary-tree/submissions/
//110. Balanced Binary Tree


class Solution {
    
    public int height(TreeNode root)
    {
        if(root==null)return 0;
        
        return 1+Math.max(height(root.left),height(root.right));
    }
    public boolean isBalanced(TreeNode root) {
        
        if(root==null)return true;
        
        int ls=height(root.left);
        int rs=height(root.right);
        
        return Math.abs(ls-rs)<=1 && isBalanced(root.left) && isBalanced(root.right);
        
    }
}