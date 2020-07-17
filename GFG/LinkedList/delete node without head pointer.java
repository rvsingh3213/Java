

//https://practice.geeksforgeeks.org/problems/delete-without-head-pointer/1


class GfG 
{
    void deleteNode(Node node)
    {
        Node n=node.next;
        node.data=n.data;
        node.next=n.next;
         
         
    }
}