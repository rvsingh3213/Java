

//https://leetcode.com/problems/binary-tree-level-order-traversal/submissions/


class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        
        List<List<Integer>> L=new ArrayList<>();       
        Queue<TreeNode> q=new LinkedList<>();
        
        if(root==null) return L;
       
        q.add(root);
        while(!q.isEmpty())
        {
            List<Integer> list=new ArrayList<>();
            int size=q.size();
            
            for(int i=0;i<size;i++)
            {
                root=q.poll();
                
                list.add(root.val);
                
                if(root.left!=null) q.add(root.left);
                
                if(root.right!=null) q.add(root.right);
                
                
            }   
            
            L.add(list);
        
        }
        //if(!list.isEmpty()) L.add(list);
        
        return L;
        
    }
}