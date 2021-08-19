

//https://practice.geeksforgeeks.org/problems/bottom-view-of-binary-tree/1

//Bottom View of Binary Tree

class Solution
{
    //Function to return a list of nodes visible from the top view 
    //from left to right in Binary Tree.
    static ArrayList<Integer> bottomView(Node root)
    {
        
        ArrayList<Integer> ls=new ArrayList<>();
        
        if(root==null)return ls;
        Queue<Node> q=new LinkedList<>();
        
        Queue<Integer> indices=new LinkedList<>();
        HashMap<Integer,ArrayList<Integer>> mp=new HashMap<>();
        int minIndex=0,maxIndex=0;
        q.add(root);
        
        indices.add(0);
        
        while(!q.isEmpty())
        {
            
            int size=q.size();
            
            for(int i=1;i<=size;i++)
            {
                
                Node n=q.poll();
                int index=indices.poll();
                
                mp.putIfAbsent(index,new ArrayList<Integer>());
                mp.get(index).add(n.data);
                
                if(n.left!=null)
                {
                    q.add(n.left);
                    indices.add(index-1);
                    minIndex=Math.min(minIndex,index-1);
                }
                if(n.right!=null)
                {
                    
                   q.add(n.right);
                   indices.add(index+1);
                   maxIndex=Math.max(maxIndex,index+1);
                }
            }
            
            
        }
        
        for(int i=minIndex;i<=maxIndex;i++)
        {
            
            ls.add(mp.get(i).get(mp.get(i).size()-1));
            
            
        }
        
        return ls;
}//Method End

}//class End