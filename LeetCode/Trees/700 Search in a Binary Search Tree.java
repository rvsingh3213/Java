

//https://leetcode.com/problems/search-in-a-binary-search-tree/
//700. Search in a Binary Search Tree

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
    public TreeNode searchBST(TreeNode root, int val) {
        
        TreeNode node=null;
        
        TreeNode current=root,parent=null;
        
        if(root.val==val)
            return root;
        
        while(current!=null)
        {
            if(current.val==val)
                {node=current;
                    return node;
                }
            if(current.val<val)
                current=current.right;
            else
                current=current.left;
        }
        
        return node;
        
        
        
    }
}