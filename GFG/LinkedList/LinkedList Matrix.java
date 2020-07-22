

//https://practice.geeksforgeeks.org/problems/linked-list-matrix/1
// generate Linkedlist from 2D matrix


class GFG
{   static Node contLL(int arr[][],int i,int j,int n)
    {
        if(i>=n || j>=n)
        return null;
        
        Node temp=new Node(arr[i][j]);
        
        temp.right=contLL(arr,i,j+1,n);
        temp.down=contLL(arr,i+1,j,n);
        
        return temp;
    }
    static Node construct(int arr[][],int n)
    {
       Node temp=contLL(arr,0,0,n);
        
        return temp;
    }
}