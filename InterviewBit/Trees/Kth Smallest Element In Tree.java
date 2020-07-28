

//https://www.interviewbit.com/problems/kth-smallest-element-in-tree/#
//Kth Smallest Element In Tree


public class Solution {
    ArrayList<Integer> list;
    private void inorder(TreeNode root)
    {
        if(root==null)return;
        
        inorder(root.left);
        
        list.add(root.val);
        
        inorder(root.right);
        
    }
    public int kthsmallest(TreeNode A, int B) {
        
        if(A==null) return -1;
        
        list=new ArrayList<>();
        
        inorder(A);
        
        return list.get(B-1);
    }
}
