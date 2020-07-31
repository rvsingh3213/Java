


//https://leetcode.com/problems/delete-node-in-a-linked-list/
//237. Delete Node in a Linked List

// so in this we have got node only which has to be deleted as we cannot change the next of previous 
//node neither we have link to that so we will replace the value of next node to this given node and 
//will delete next node as node which is getting delete its value is already we have in given node
class Solution {
    public void deleteNode(ListNode node) {
        
    
        if(node.next==null || node==null)return;
        
        node.val=node.next.val;
        node.next=node.next.next;
        
    }
}