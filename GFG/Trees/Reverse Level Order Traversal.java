

//https://practice.geeksforgeeks.org/problems/reverse-level-order-traversal/1/

//Reverse Level Order Traversal 


class Tree
{     static int height(Node root)
    {
        if(root==null)return 0;
        
        return 1+Math.max(height(root.left),height(root.right));
    }
    static void printGivenLevel(Node root,int level)
    {   
        if(root==null)return;
        
        if(level==1)
        {
            System.out.print(root.data+" ");
        }
        
        printGivenLevel(root.left,level-1);
        printGivenLevel(root.right,level-1);
    }
    static void reversePrint(Node node)
    {
        if(node==null)return;
        
        int height=height(node);
        
        for(int i=height;i>=0;i--)
        printGivenLevel(node,i+1);
    }
	      
}  
