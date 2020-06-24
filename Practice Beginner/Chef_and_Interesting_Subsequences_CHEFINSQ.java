	
//https://www.codechef.com/problems/CHEFINSQ

Chef and Interesting Subsequences Problem Code: CHEFINSQ	

	
	/* package codechef; // don't place package name! */

	import java.util.*;
	import java.lang.*;
	import java.io.*;
	import java.math.BigInteger;
	

	/* Name of the class has to be "Main" only if the class is public. */
	class Codechef
	{     static BigInteger factorial(int n)
	      {
	          BigInteger fac=BigInteger.ONE;
	          
	          for(int i=1;i<=n;i++)
	          fac=fac.multiply(BigInteger.valueOf(i));
	          
	          return fac;
                     
	      }
		static BigInteger NCR(int n, int r) { 
           /* if(n-r>r)
            r=n-r;
            */
            BigInteger d=factorial(n-r).multiply(factorial(r));
            
            return factorial(n).divide(d);
            
		}
  

		public static void main(String args[])
		{
			Scanner sc=new Scanner(System.in);
			
			int T=sc.nextInt();
			
			while(T>0)
			{	T--;
			
				int N=sc.nextInt();
				int K=sc.nextInt();
				int arr[]=new int[N];
				
				for(int i=0;i<N;i++)
					arr[i]=sc.nextInt();
				
				Arrays.sort(arr);
				
				int element=arr[K-1];
				int count=0;
				for(int i=0;i<N;i++)
					if(arr[i]==element)
						count++;
					
					int count_in_arr=0;
				for(int i=0;i<K;i++)
					if(arr[i]==element)
						count_in_arr++;
					
					System.out.println(NCR(count,count_in_arr));
				
			}
		
		}
	}

