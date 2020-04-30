Factorial Problem Code: FCTRL

Problem Code: FCTRL

https://www.codechef.com/viewsolution/31448933

/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
      static int tzero(int l)
		{   int count=0;
		    while(l>=5)
		    {
		        count+=l/5;
		        l=l/5;
		    }
		    return count;
		    
		}
    
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here]
	    Codechef obj=new Codechef();
	    
		Scanner sc=new Scanner(System.in);
		
		int T;
		T=sc.nextInt();
		int num;
		for(int i=0;i<T;i++)
		{
		    num=sc.nextInt();
		    System.out.println(tzero(num));
		}
	}
}

