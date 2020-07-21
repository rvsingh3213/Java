

//https://practice.geeksforgeeks.org/problems/sort-a-linked-list/1


    class LinkedList
    {
	static Node mergeSortedList(Node A,Node B)
	{
		Node result=null;
		
		if(A==null)
			return B;
		
		if(B==null)
			return A;
		
		if(A.data<=B.data)
		{
			result=A;
			A.next=mergeSortedList(A.next,B);
		}
		if(B.data<A.data)
		{
			result=B;
			B.next=mergeSortedList(A,B.next);
		}
		
		return result;
		
		
	}
    static Node mergeSort(Node head)
    {
		
		if(head==null || head.next==null)
			return head;
		
		Node middle=findMiddle(head);
		
		Node middleNext=middle.next;
		
		middle.next=null;
		
		Node left=mergeSort(head);
		Node right=mergeSort(middleNext);
		
		Node result=mergeSortedList(left,right); // it will merge two sorted LLists


		return result;
    }
	
	static Node findMiddle(Node h)
	{   
	    if(h==null)
	    return h;
	    Node fast=h;
		Node slow=h;
		
		while(fast.next!=null && fast.next.next!=null)
		{
			slow=slow.next;
			fast=fast.next.next;
		}
		
		return slow;
	}
	
    }

