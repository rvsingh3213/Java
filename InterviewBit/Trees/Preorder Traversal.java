

//https://www.interviewbit.com/problems/preorder-traversal/


public class Solution {
    public ArrayList<Integer> preorderTraversal(TreeNode root) {
        
        ArrayList<Integer> list=new ArrayList<>();
        
        Stack<TreeNode> s=new Stack<>();
        s.push(root);
        while(!s.isEmpty())
        {
            root=s.pop();
            list.add(root.val);
            
            if(root.right!=null)
            {
                s.push(root.right);
            }
            if(root.left!=null)
            {
                s.push(root.left);
            }
            
        }
        return list;
    }
}