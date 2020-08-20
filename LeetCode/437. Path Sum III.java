
//https://leetcode.com/problems/path-sum-iii/
//437. Path Sum III

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    private int pathSum_a(TreeNode root,int sum)
    {
        if(root==null)return 0;
        int res=0;
        
        if(root.val==sum)res++;
        
        res+=pathSum_a(root.left,sum-root.val);
        res+=pathSum_a(root.right,sum-root.val);
        
        return res;
        
    }
    
    public int pathSum(TreeNode root, int sum) {
        
        if(root==null)return 0;
        
        return pathSum(root.left,sum)+ pathSum_a(root,sum)+pathSum(root.right,sum);
        
    }
}