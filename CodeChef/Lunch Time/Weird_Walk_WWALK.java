

//https://www.codechef.com/LTIME84B/problems/WWALK

Weird Walk Problem Code: WWALK



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
			int T=sc.nextInt();
			
			while(T>0)
			{	T--;
		
				int N=sc.nextInt();
				int arr[][]=new int[2][N];
				long total=0L;
				long T1=0L;long T2=0L;
				for(int i=0;i<2;i++)
					for(int j=0;j<N;j++)
					{
						arr[i][j]=sc.nextInt();
						
					}
					

                        if(arr[0][0]==arr[1][0])
                        total+=arr[0][0];
                        T1+=arr[0][0];
                        T2+=arr[1][0];
				for(int i=1;i<N;i++)
				{	
					
							
							
					
					if((T1==T2) && (arr[0][i]==arr[1][i]) )
					{	
						
						total+=arr[0][i];
						
					}
				
					T1+=arr[0][i];
					T2+=arr[1][i];
				}
				
				
				System.out.println(total);
				  
			}
		}
	}
