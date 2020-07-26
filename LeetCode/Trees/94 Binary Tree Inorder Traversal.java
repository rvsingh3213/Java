
//https://leetcode.com/problems/binary-tree-inorder-traversal/

//94. Binary Tree Inorder Traversal

class Solution {
   static List<Integer> list;
    
   static void inorder(TreeNode root)
    {
        if(root==null) return;
       
       inorder(root.left);
       
       list.add(root.val);
          
       inorder(root.right);
        
    }
    public List<Integer> inorderTraversal(TreeNode root) {
        
        list=new ArrayList<>();
        inorder(root);
        return list;
        
    }
}