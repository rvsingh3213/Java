

//https://practice.geeksforgeeks.org/problems/right-view-of-binary-tree/1

//Right View of Binary Tree

class Solution{
    //Function to return list containing elements of right view of binary tree.
    ArrayList<Integer> rightView(Node node) {
        
        ArrayList<Integer> list=new ArrayList<>();
        
        if(node==null)return list;
        
        Queue<Node> queue=new LinkedList<>();
        
        queue.add(node);
        
        while(!queue.isEmpty())
        {
            int size=queue.size();
            
            for(int i=1;i<=size;i++)
            {
                Node n=queue.poll();
                if(i==size)
                list.add(n.data);
                
                if(n.left!=null)
                queue.add(n.left);
                
                if(n.right!=null)
                queue.add(n.right);
            }
            
            
            
        }
        return list;
    }
}