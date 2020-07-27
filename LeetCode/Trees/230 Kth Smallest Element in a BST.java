
//https://leetcode.com/problems/kth-smallest-element-in-a-bst/submissions/

//230. Kth Smallest Element in a BST


class Solution {
    ArrayList<Integer> list;
    
   public void inorder(TreeNode root)
   {
       if(root==null)return;
       
       inorder(root.left);
       
       list.add(root.val);
       
       inorder(root.right);
       
   }
    
    public int kthSmallest(TreeNode root, int k) {
        
        //if(root ==null) return 
        list=new ArrayList<Integer>();
        
        inorder(root);
        //System.out.println(list.toString());
        
        
        return list.get(k-1);
        
    }
}