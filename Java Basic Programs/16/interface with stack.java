import java.util.*;

interface i_fase
{	
  public void push(int item);
  public void pop();
}

 class stk_class implements i_fase
 {
  int stack[];
  int top,sz;
  stk_class(int size)
  { top=-1;
    sz=size;
    stack=new int[size];
  }

 public void push(int item)
 {
  	if(top==-1)
  	 {top=0; 
	  stack[top++]=item;
	  
	  }
        else if(top==sz)
     	 {
	System.out.println("Overflow");
	  }
	else
	stack[top++]=item;
	
  }
 
   public void pop()
  {
     if(top==-1)
     {System.out.println("Underflow");
	} 	

     else
    {System.out.println("Element Deleted");
     top--;
    }
  }
 void show()
 {
for(int i=0;i<sz;i++)
System.out.print(stack[i]+" ");
 }

 }

public class cube
{
	public static void main(String args[])
	{ Scanner sc=new Scanner(System.in);
	int size,flag,item;
   
	System.out.println("Enter Size of Stack");
   	size=sc.nextInt();
	stk_class obj=new stk_class(size);
        
 	System.out.println("Enter 1 to add:");
	System.out.println("Enter 2 to delete:");  	
	System.out.println("Enter to exit:3");
        flag=sc.nextInt();
  	while(flag!=3)
	{
	if(flag==1)
	{System.out.println("Enter element:");
	item=sc.nextInt();
	obj.push(item);
	 }
	else if(flag==2)
	obj.pop();
        
	else
	{
	System.out.println("Exit Stack");

	}
	
	System.out.println("Enter 1 to add:");
	System.out.println("Enter 2 to delete:");  	
	System.out.println("Enter to exit:3");
        flag=sc.nextInt();
	}

	System.out.println("\n\n");
	obj.show();
        }
}