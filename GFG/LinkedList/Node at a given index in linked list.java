

//https://practice.geeksforgeeks.org/problems/node-at-a-given-index-in-linked-list/1/

// required method getNth
class GfG
{
   
    public static int getNth(Node node, int ind)
    {
       Node n=node;
       int count=1;
       while(count<ind)
       {
           n=n.next;
           count++;
       }
       return n.data;
    }
}