

//https://www.interviewbit.com/problems/balanced-binary-tree/


public class Solution {
    public int height(TreeNode root)
    {
        if(root==null) return 1;
        
        int ls=height(root.left);
        
        if(ls==-1)return -1;
        int rs=height(root.right);
        
        if(rs==-1)return -1;
        
        
        if(Math.abs(ls-rs)>1)return -1;
        return 1+Math.max(ls,rs);
        
        
        
    }
    public int isBalanced(TreeNode A) {
        
        if(A==null)return 1;
        
        return (height(A)!=-1) ? 1 :0;
        
    }
}
