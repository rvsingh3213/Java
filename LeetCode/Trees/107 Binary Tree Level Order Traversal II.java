

//https://leetcode.com/problems/binary-tree-level-order-traversal-ii/submissions/

//107 Binary Tree Level Order Traversal II


class Solution {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        
        List<List<Integer>> L=new ArrayList<>();
        
        if(root==null) return L;
        Queue<TreeNode> s=new LinkedList<>();
        s.add(root);
        while(!s.isEmpty())
        {
            int size=s.size();
            ArrayList<Integer> list=new ArrayList<>();
          for(int i=0;i<size;i++)
            {
                root=s.poll();
                
              list.add(root.val);
              
              if(root.left!=null) s.add(root.left);
               if(root.right!=null) s.add(root.right);
              
             
                
            }
            
            L.add(list);
            
            
        }
        
        Collections.reverse(L);
        
        return L;
    }
}