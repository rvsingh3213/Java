	

//https://practice.geeksforgeeks.org/problems/inorder-traversal/1/
// recursively can also do same
class Tree
{
    
    ArrayList<Integer> inOrder(Node root)
    {   ArrayList<Integer> list=new ArrayList<Integer>();
        if(root==null) return list;
        
        
        Stack<Node> s=new Stack<>();
        
        while(true)
        {
            if(root!=null)
            {
                s.push(root);
                root=root.left;
            }
            else
            {
                if(s.empty()) break;
                
                root=s.pop();
                list.add(root.data);
                root=root.right;
            }
            
        }
        return list;
    }
}