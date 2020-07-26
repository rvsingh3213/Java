

//https://www.interviewbit.com/problems/postorder-traversal/


    public class Solution {
        public ArrayList<Integer> postorderTraversal(TreeNode root) {
            
             ArrayList<Integer>list =new ArrayList<>();
           
           if(root==null) return list;
           
           Stack<TreeNode> s1=new Stack<>();
           Stack<TreeNode> s2=new Stack<>();
           
           s1.push(root);
           
           while(!s1.isEmpty())
           {
               root=s1.pop();
               
               s2.push(root);
               
               if(root.left!=null) s1.push(root.left);
               
               if(root.right!=null) s1.push(root.right);
               
               
               
           }
           
           while(!s2.isEmpty())
           {    root=s2.pop();
               list.add(root.val);
           }
           
           return list;
        
        }
    }
