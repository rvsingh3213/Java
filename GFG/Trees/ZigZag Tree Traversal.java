
//https://practice.geeksforgeeks.org/problems/zigzag-tree-traversal/1

//ZigZag Tree Traversal 

class GFG
{
    //Function to store the zig zag order traversal of tree in a list.
	ArrayList<Integer> zigZagTraversal(Node root)
	{
	    //Add your code here.
	    ArrayList<Integer> list=new ArrayList<>();
        if(root==null)return list;
        
	    Stack<Node> s1=new Stack<>();
	    Stack<Node> s2=new Stack<>();
	    
	    s1.push(root);
	    
	    while(!s1.isEmpty() || !s2.isEmpty()){
	        
	        while(!s1.isEmpty())
	        {
	            Node n=s1.pop();
	            list.add(n.data);
	              if(n.left!=null)s2.push(n.left);
	              if(n.right!=null)s2.push(n.right);
	              
	        }
	        
	        while(!s2.isEmpty())
	        {
	            Node n=s2.pop();
	            list.add(n.data);
	            if(n.right!=null)s1.push(n.right);
	            if(n.left!=null)s1.push(n.left);
	        }
	        
	        
	    }
	    
	    return list;
	    
	    
	    
		}
}