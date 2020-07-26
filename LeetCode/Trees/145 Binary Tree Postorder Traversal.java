

//https://leetcode.com/problems/binary-tree-postorder-traversal/submissions/


class Solution {
    static List<Integer> list;
   void postOrder(TreeNode root)
    {
        if(root==null)return;
        
        postOrder(root.left);
        
        postOrder(root.right);
        list.add(root.val);
    }
    public List<Integer> postorderTraversal(TreeNode root) {
        
        list=new ArrayList<>();
        if(root==null) return list;
        
        postOrder(root);
        return list;
        
    }
}