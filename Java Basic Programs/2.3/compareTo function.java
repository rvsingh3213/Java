import java.util.*;

//Finding all the Substrings of String



class cube
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);	
		String s1=sc.next();
		int len=s1.length();

		for(int i=0;i<len;i++)
		   for(int k=len-1;k>=i;k--)
		      System.out.println(s1.substring(i,k+1));
	
		   		


	
	}



}