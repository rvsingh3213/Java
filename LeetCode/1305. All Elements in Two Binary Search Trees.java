

//	https://leetcode.com/problems/all-elements-in-two-binary-search-trees/
//1305. All Elements in Two Binary Search Trees

class Solution {
    List<Integer> list;
    
    private void find(TreeNode root)
    {
        
        if(root==null)return;
        
        list.add(root.val);
        
        find(root.left);
        find(root.right);
    }
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
            
           list=new ArrayList<Integer>();
        
            find(root1);
            find(root2);
        
     //   if(list.size()>0)
        Collections.sort(list);
        
        return list;
        
    }
}