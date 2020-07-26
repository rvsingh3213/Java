

//https://www.interviewbit.com/problems/inorder-traversal/#



public class Solution {
    
    public ArrayList<Integer> inorderTraversal(TreeNode root) {
        ArrayList<Integer> list=new ArrayList<Integer> ();
        if(root==null)
        return list;
        
        Stack<TreeNode> s=new Stack<>();
        
        while(true)
        {
            if(root!=null){
                
                s.push(root);
                root=root.left;
                
            }
            else
            {
                if(s.empty()) break;
                
                root=s.pop();
                list.add(root.val);
                
                root=root.right;
                
            }
            
            
            
        }
        return list;
    }
}
