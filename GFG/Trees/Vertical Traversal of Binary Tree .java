
//https://practice.geeksforgeeks.org/problems/print-a-binary-tree-in-vertical-order/1
//Vertical Traversal of Binary Tree

class BinaryTree
{
    static ArrayList <Integer> verticalOrder(Node root)
    {
        
           ArrayList<Integer> res=new ArrayList<>();
        
        if(root==null)return res;
        
        Queue<Node> q=new LinkedList<>();
        q.offer(root);
        
        Map<Integer,List<Integer>> mp=new HashMap<>();
        
        Queue<Integer> indices=new LinkedList<>();
        indices.offer(0);
        int minIndex=0,maxIndex=0;
        
        
        while(!q.isEmpty())
        {
            int size=q.size();
            for(int i=0;i<size;i++)
            {
                Node node=q.poll();
                int index=indices.poll();
                
                mp.putIfAbsent(index,new ArrayList<>());
                mp.get(index).add(node.data);
               
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
            int size=mp.get(i).size();
            for(int ii=0;ii<size;ii++)
            res.add(mp.get(i).get(ii));
        }
        
        return res;       
    }
}