


//https://practice.geeksforgeeks.org/problems/level-order-traversal-line-by-line/1/
//Level order traversal Line by Line

class Level_Order_Traverse
{   
    static int height(Node root)
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
    static void levelOrder(Node node) 
    {
        if(node==null)return;
        
        int height=height(node);
        
        for(int i=0;i<height;i++)
        {printGivenLevel(node,i+1);System.out.print("$ ");}
    }
}