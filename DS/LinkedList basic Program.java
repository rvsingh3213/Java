


import java.io.*;
import java.util.*;
import java.lang.*;

class LinkedList{
	Node head;
	static class Node{
					int data;
					Node next;		
				
					Node(int a){data=a;}
				}
				
				
	static void printList(LinkedList llist)
	{	
		Node n=llist.head;
		while(n!=null)
		{
			System.out.println(n.data);
			n=n.next;
		}
	}
	
	public static void main(String args[])
	{
		LinkedList llist=new LinkedList();
		//Creating 3 Nodes and put data
		
		llist.head=new Node(10);
				
		Node second=new Node(20);
		Node third=new Node(30);
		
		
		//now link
		
		llist.head.next=second;
		second.next=third;
		
		printList(llist);
		
	}
	
}