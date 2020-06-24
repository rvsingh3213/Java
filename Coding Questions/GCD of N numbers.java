/* package codechef; // don't place package name! */
// T is number of Test Cases
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class CodeChef2
{
	static int gcd(int a,int b)
    {
        if(a==0)
        return b;
        if(b==0)
        return a;
        if(a==b)
        return a;

        if(a>b)
        return gcd(a%b,b);
        else
        return gcd(a,b%a);

    
    }
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		while((T--)>0)
		{
		int N=sc.nextInt(); //provided N>=2
		
		int arr[]=new int[N];
		if(N==1)
		{    arr[0]=sc.nextInt();
			System.out.println(arr[0]);
		}
		else
		   {
			
			for(int i=0;i<N;i++)
				arr[i]=sc.nextInt();
		
			int GCD=gcd(arr[0],arr[1]);
			if(N>2)
			for(int i=2;i<N;i++)
			{
				GCD=gcd(GCD,arr[i]);
			}
			System.out.println(GCD);
		   }
		}
	}
}
