

//https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-search-tree/
//235. Lowest Common Ancestor of a Binary Search Tree


class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        
        int one=p.val;
        int two=q.val;
        if(root.val>Math.max(p.val,q.val))
            return lowestCommonAncestor(root.left,p,q);
        
        if(root.val<Math.min(p.val,q.val))
            return lowestCommonAncestor(root.right,p,q);
        
        return root;
        
    }
}