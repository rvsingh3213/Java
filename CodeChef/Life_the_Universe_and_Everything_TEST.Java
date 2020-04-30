Problem Code: TEST
 
 Java Solution

https://www.codechef.com/viewsolution/31360144

/*
Your program is to use the brute-force approach in order to find
the Answer to Life, the Universe, and Everything. More precisely...
rewrite small numbers from input to output. Stop processing input after
reading in the number 42. All numbers at input are integers of one or two digits.

Example
Input:
1
2
88
42
99

Output:
1
2
88



*/


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
	boolean flag=true;
	int num;
	while(flag)
	{
	    num=sc.nextInt();
	    
	    if(num!=42)
	    System.out.println(num);
	    else
	    flag=false;
	}
		
		
		//System.out.println();
	}
}


