import java.util.*;

	public class stack
{	static int top=-1,size;

	static int arr[];
	public static void push(int val)
	{
	   if(top==-1)
	   {
	   top=0; arr[top]=val;
	   top++;
	   }
 	
	   else if(top==size)
   	   System.out.println("OverFlow:");
	   else 
	   {arr[top]=val;
	   top++;
	   }	
	}


        public static void pop()
	{
	  if(top==-1)
	  System.out.println("underflow:");
	  else 
	  top--;	
	}

	public static void main(String args[])
	{
	

  	 Scanner sc=new Scanner(System.in);

	 int ch;
	 System.out.print("Enter Size of array:");
	 size=sc.nextInt();
	 arr=new int[size];	
	
	 System.out.println("Enter 1 for push()");
 	 	System.out.println("Enter 2 for pop()");
		System.out.println("Enter e for exit");
		ch=sc.nextInt();
	

	while(ch!=3)
	{ 	
		
		if(ch==1)
		{
		
		System.out.println("Enter Element to add:");
		int val=sc.nextInt();
		push(val);
		}
		
		else if(ch==2)
		pop();
		
		else
		 break;

	System.out.println("Enter  1 for push()");
		System.out.println("Enter 2 for pop()");
		System.out.println("Enter 3 for exit");
 	ch=sc.nextInt();
		
	}
	System.out.println("Array Elements are:"+ "");
	for(int i=0;i<arr.length;i++)
	System.out.print(arr[i]+" ");
	



    }


}