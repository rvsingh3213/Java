

//https://practice.geeksforgeeks.org/problems/detect-loop-in-linked-list/1


/* Node is defined as

class Node
{
    int data;
    Node next;
    Node(int d) {data = d; next = null; }
}

*/


class Solution {
    public static boolean detectLoop(Node head){
       
       if(head==null || head.next==null)
       return false;
       Node slow=head;
       Node fast=head.next;
       
       while(slow!=fast)
       {
           if(fast==null || fast.next==null)
           {
               return false;
           }
           slow=slow.next;
           fast=fast.next.next;
       }
       return true;
    }
}