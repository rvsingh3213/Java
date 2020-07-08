import java.util.*;
import java.io.IOException;
//import java.lang.*;


class cube
{
	public static void main(String args[])
	{
		try{
		
			try{   System.out.println("Going to divide by zzzero");
				int a=10/0;
				}
			catch(ArithmeticException e)
			{System.out.println(e);}

			try{
				System.out.println("will give aarrbound except");
				int a[]=new int[6];
				a[6]=20;
				}
			catch(ArrayIndexOutOfBoundsException e)
			{System.out.println(e);}


	   	  }
		//Control will not come to it Cause Exception has already beed 
		//Handled inside of Try Block
		catch(Exception e){System.out.println(e);}
		
		   		


	
	}



}