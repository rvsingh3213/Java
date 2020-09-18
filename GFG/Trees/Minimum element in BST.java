

//https://practice.geeksforgeeks.org/problems/minimum-element-in-bst/1/

// { Driver Code Starts
//Initial Template for Java


// your task is to complete the below function
class Tree
{
    int minValue(Node node)
    {
        if(node==null)
        return -1;
        
        if(node.left==null)
        return node.data;
        
        Node current=node;
        
        while(current.left!=null)
        {
            current=current.left;
        }
        
        return current.data;
    }
}

