

//https://www.codechef.com/JUNE20B/problems/EVENM
// problem code::EVENM

//from codechef JuneChallenge div2

/* package codechef; // don't place package Name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "MaiN" oNly if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		
		int T=sc.nextInt();
		
	while(T>0)
	{	
	      T--;
				
		int N=sc.nextInt();
		
		int[][] arr = new int[N][N];
         
		int number=1;
		
		int min_R=0;
		
		int min_C=0;
		
		int max_R=N-1;
		
		int max_C=N-1;
		
		while(number<=N*N)
		{
			for(int i=min_C;i<=max_C;i++)
			{	
			      arr[min_R][i]=number;
			
			      number++;
			}
				
			for(int i=min_R+1;i<=max_R;i++)
			{
				arr[i][max_C]=number;
				
				number++;
			}
			for(int i=max_C-1;i>=min_C;i--)
			{
				arr[max_R][i]=number;
				
				number++;
			}
			for(int i=max_R-1;i>min_R;i--)
			{
      			arr[i][min_C]=number;
      			
				number++;
			}
			min_R++;
			
			min_C++;
			
			max_R--;
			
			max_C--;
		}



		for(int i=0;i<arr.length;i++)
		
		{	for(int j=0;j<arr.length;j++)
		     	 { 
		      	       System.out.print(arr[i][j]+" ");
		     	 }
			
			System.out.println();
		}
			
	
	} //while T end
	
	}//main end
	
}


