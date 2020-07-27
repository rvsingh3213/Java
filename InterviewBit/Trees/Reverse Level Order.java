

//https://www.interviewbit.com/problems/reverse-level-order/#

//Reverse Level Order


public class Solution {
    
    ArrayList<Integer> list;
      static int height(TreeNode root)
    {
        if(root==null)return 0;
        
        return 1+Math.max(height(root.left),height(root.right));
    }
   static void printGivenLevel(TreeNode root,int level)
    {   
        if(root==null)return;
        
        if(level==1)
        {
            System.out.print(root.val+" ");
        }
        
        printGivenLevel(root.left,level-1);
        printGivenLevel(root.right,level-1);
    }
    public ArrayList<Integer> solve(TreeNode node) {
        list=new ArrayList<>();
        if(node==null)return list;
        
        int height=height(node);
        
        for(int i=height;i>=0;i--)
        printGivenLevel(node,i+1);
        
        return list;
    }
          
}  


