


//https://leetcode.com/problems/binary-tree-preorder-traversal/


class Solution {
    static List<Integer> list;
    
    void preOrder(TreeNode root)
    {
        if(root==null)return;
        
        list.add(root.val);
        
        preOrder(root.left);
        preOrder(root.right);
        
        
    }
    public List<Integer> preorderTraversal(TreeNode root) {
        
        list=new ArrayList<>();
        
        if(root==null)
            return list;
        
        preOrder(root);
        
        return list;
        
    }
}