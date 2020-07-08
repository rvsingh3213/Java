import java.util.Scanner;

class larger

{
public static void main(String arg[])
{
Scanner sc=new Scanner(System.in);

System.out.println("Enter The number A:");
int a=sc.nextInt();

System.out.println("Enter The number B:");
int b=sc.nextInt();
System.out.println("Enter The number C:");
int c=sc.nextInt();
System.out.println("Enter The number D:");
int d=sc.nextInt();

if(a>b)
{ 
	if(a>c)
	  {
		if(a>d)
		   System.out.println("\n\nGreater is A:"+a);	
		else 
		   System.out.println("\n\nGreater is D:"+d);
     	}
	else 
	 { 
		if(c>d)
			System.out.println("\n\nGreater is C:"+c);  

		  else
			System.out.println("\n\nGreater is D:"+d);

	  }


}

else

	{  
		if(b>c)
		   {
			if(b>d)
				System.out.println("\n\nGreater is B:"+b);	
			else
				System.out.println("\n\nGreater is D:"+d);
		  }	
		else
		{
			if(c>d)
				System.out.println("\n\nGreater is C:"+c);
			else
				System.out.println("\n\nGreater is D:"+d);
		}




	}



sc.close();  // program should be neat and clean so that it ias eady to understand the code.

}}