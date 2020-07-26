

//https://www.hackerrank.com/challenges/tree-level-order-traversal/problem


	public static void levelOrder(Node node) {

        
        if(node==null)return ;
        Queue<Node> q=new LinkedList<>();
        
        q.add(node);
        
        while(!q.isEmpty())
        {
            node=q.poll();
            
            System.out.print(node.data+" ");
            
            if(node.left!=null)
            q.add(node.left);
            if(node.right!=null)
            q.add(node.right);
            
        }     
      
    }
