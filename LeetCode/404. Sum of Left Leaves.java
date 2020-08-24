
//https://leetcode.com/problems/sum-of-left-leaves/
//404. Sum of Left Leaves


    public int sumOfLeftLeaves(TreeNode root) {
        
      if(root==null)return 0;
      if(root.left==null && root.right==null)return 0;
      if(root.left==null )
          return sumOfLeftLeaves(root.right);
      if(root.right==null)
          sumOfLeftLeaves(root.left);
        
      if(root.left.left==null && root.left.right==null)
          return root.left.val+sumOfLeftLeaves(root.right) ;
     
        return sumOfLeftLeaves(root.left)+sumOfLeftLeaves(root.right);
        
    }
}