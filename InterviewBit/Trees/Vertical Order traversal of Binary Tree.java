
//https://www.interviewbit.com/problems/vertical-order-traversal-of-binary-tree/#
//Vertical Order traversal of Binary Tree

public class Solution {
    public ArrayList<ArrayList<Integer>> verticalOrderTraversal(TreeNode root) {
        
        
           ArrayList<ArrayList<Integer>> res=new ArrayList<>();
        
        if(root==null)return res;
        
        Queue<TreeNode> q=new LinkedList<>();
        q.offer(root);
        
        Map<Integer,ArrayList<Integer>> mp=new HashMap<>();
        
        Queue<Integer> indices=new LinkedList<>();
        indices.offer(0);
        int minIndex=0,maxIndex=0;
        
        
        while(!q.isEmpty())
        {
            int size=q.size();
            for(int i=0;i<size;i++)
            {
                TreeNode node=q.poll();
                int index=indices.poll();
                
                mp.putIfAbsent(index,new ArrayList<>());
                mp.get(index).add(node.val);
               
                 if(node.left!=null)
                {
                    q.offer(node.left);
                    indices.offer(index-1);
                    minIndex=Math.min(minIndex,index-1);
                }
                
                
                if(node.right!=null)
                {
                    q.offer(node.right);
                    indices.offer(index+1);
                    maxIndex=Math.max(maxIndex,index+1);
                }
                /*
                
                [0,2,1,3,null,null,null,4,5,null,7,6,null,10,8,11,9]
                
                [0,5,1,9,null,2,null,null,null,null,3,4,8,6,null,null,null,7]
                */
                
            }     
            
        }
        
        for(int i=minIndex;i<=maxIndex;i++)
        {   //Collections.sort(mp.get(i));
            
            res.add(mp.get(i));
        }
        
        return res;
        
    }
}
