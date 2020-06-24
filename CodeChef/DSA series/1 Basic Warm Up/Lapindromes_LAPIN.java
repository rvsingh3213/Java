Problem Code: LAPIN


https://www.codechef.com/viewsolution/31361991


********************Solution*********************


/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int T;
		T=sc.nextInt();
		int l;
		String st=new String(),st1,st2;
		char ch2[];
		while(T!=0)
		{
		  st=sc.next();
		  l=st.length();
	char ch1[]=st.substring(0,l/2).toCharArray();
	if(l%2==0)
	    ch2=st.substring(l/2,l).toCharArray();
	else
	     ch2=st.substring(l/2+1,l).toCharArray();
	
	Arrays.sort(ch1);
	Arrays.sort(ch2);
		 st1=String.valueOf(ch1);
		 st2=String.valueOf(ch2);
        //System.out.println(st1+"  "+st2);
        if(st1.equals(st2))
        System.out.println("YES");
		else
		System.out.println("NO");
		  
		  T--;
		}
	}
}

