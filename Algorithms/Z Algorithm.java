/* package codechef; // don't place package name! */


// This is Z algorithm
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{	static int[] CalculateZ(String str)
	{
		int l=str.length();
		int left=0;
		int right=0;
		int Z[]=new int[l];
		Z[0]=0;
		for(int k=1;k<l;k++)
		{
			if(k>right)
			{
				left=right=k;
				
				while(right<l && str.charAt(right)==str.charAt(right-left))
				{
					right++;
				}
				Z[k]=right-left;
				right--;
			}
			else
			{
				int k1=k-left;
				
				if(Z[k1]<right-k+1)
				{
					Z[k]=Z[k1];
				}
				/*else
				{
					left=k;
					while(right<l && str.charAt(right)==str.charAt(right-left))
					{
						right++;
					}
					Z[k]=right-left;
					right--;
					
				}*/
			}
		}
		return Z;
	}
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		String text="xabcxxaabcfabc";//sc.next();
		String pattern="abc";//sc.next();
		
		int arr[]=CalculateZ(pattern+"$"+text);
		
		for(int i=4;i<arr.length;i++) //replace 4 with length of pattern
		{
			if(arr[i]==3)
			System.out.print(i-4+" ");
		}
	}
}
