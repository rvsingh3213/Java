

//https://practice.geeksforgeeks.org/problems/height-of-binary-tree/1



class Tree
{
    // return the Height of the given Binary Tree
    int height(Node root) 
    {
         if(root==null)
         return 0;
         
         int LH=height(root.left); //LH leftheight
         int RH=height(root.right);//RH rightHeight
         
         return 1+Math.max(LH,RH);
    }   
}
