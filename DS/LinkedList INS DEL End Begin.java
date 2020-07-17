
import java.io.*;
import java.lang.*;
import java.util.*;


class LinkedList{
	
	Node head;
	
	static class Node{
		
		int data;
		Node next;
		
		Node(int a){data=a;}
		Node(){}
		
	}

	//Insertion at beginning
	void insBeg(int a)
	{
		Node temp=new Node(a);
		temp.next=head;
		head=temp;
	}
	
	//Insertion at the End of LL
	void insEnd(int a)
	{
		Node temp=new Node(a);
		Node n=new Node();
		
		n=head;
		while(n.next!=null)
		{
			n=n.next;
		}
		n.next=temp;
		temp.next=null;
	}
	//delete beginning Node
	void begDelete()
	{	if(head==null)
		{	System.out.println("LL empty cannot delete");
			return;
		}
		head=head.next;
	}
	//delete Last Node
	void endDelete()
	{	//Node prev=new Node();
		Node n=new Node();
		
		if(head==null)
		{	System.out.println("LL empty cannot delete");
			return;
		}
		
		//if LL has 1 node
		if(head.next==null)
		{
			head=null;
			return;
		}
		n=head;
		//it works LL has more than 1 node
		while(n.next.next!=null)
		{
			n=n.next;
		}
		n.next=null;
		
	}
	// it will print LL
    void printList()
	{	
		if(head==null)
		{System.out.println("LL Empty");return;}
		Node n=head;
		
		while(n!=null)
		{
			System.out.print(n.data+" ");
			n=n.next;
		}
		
		
	}
	
	//
	
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		
		LinkedList llist=new LinkedList();
		
		Node n=new Node(10);
		
		llist.head=n;
		
		Node n2=new Node(20);
		llist.head.next=n2;
		
		Node n3=new Node(30);
		n2.next=n3;
		
		Node n4=new Node(40);
		n3.next=n4;
		
		Node n5=new Node(50);
		n4.next=n5;
		
		//llist.printList();
		int d;
		boolean flag=true;
		while(flag)
		{
			System.out.println("\nPress:\n1 Insert at beginning\n"+
										"2 Insert at End\n"+
										"3 Delete Node from beginning\n"+
										"4 Delete Node from End\n"+
										"5 Print LL	\n"+
										"6 Print and Exit\n\n"
							  );
								
			int a=sc.nextInt();
			

			if(a==1)
			{
				System.out.println("Enter Data:"); d=sc.nextInt();
				
				llist.insBeg(d);	
				System.out.println("Inserted");
			}
			if(a==2)
			{	System.out.println("Enter Data:"); d=sc.nextInt();
				llist.insEnd(d);
				System.out.println("Inserted");
				
			}
			if(a==3)
			{	llist.begDelete();
				System.out.println("Node Deleted");
			}
			if(a==4)
			{
				llist.endDelete();
				System.out.println("Node Deleted");
			}
			if(a==5)
			{
				llist.printList();
				System.out.println();
			}
			
			if(a==6)
			{	System.out.print("LL:");
				llist.printList();
				flag=false;
			}
		}
		
		
		
	}
	
	
	
}