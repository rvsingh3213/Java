
//https://www.codechef.com/HALO2020/problems/SMVOL


//https://www.codechef.com/HALO2020/problems/LOGIC

//Build The Logic Problem Code: LOGIC


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
				long n=sc.nextLong();
				if(n==1)
			      {System.out.println("1");continue;}
				else if(n==2)
				{System.out.println("2");continue;}
				
			//	int total_faces=n*n*6; // total faces
				
				long showing=8L; // for corners
				showing+= 12*((n-2));   //total faces on 12 edges
				showing+= 6*(n*n-4-(4*(n-2)));//faces on each side ecluding corner and edges
										// 4*(n-2) these faces already got counted by edges
			
					
				System.out.println(showing);	
			
			} //while T end
		
		}//main end
		
	}

