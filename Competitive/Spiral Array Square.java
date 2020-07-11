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
			int N=sc.nextInt();
			int arr[][]=new int[N][N];
			int number=1;
			int SR=0;	// Start Row
			int ER=N-1;	// End Row
			int SC=0;	//Start Col
			int EC=N-1; //End Col
			
			while(number<=N*N)
			{
				for(int i=SC;i<=EC;i++)
					{	arr[SR][i]=number;
						number++;
					}
				for(int i=SR+1;i<=ER;i++)
					{
						arr[i][EC]=number;
						number++;
					}
				for(int i=EC-1;i>=SC;i--)
				{
					arr[ER][i]=number;
						number++;
				}
				
				for(int i=ER-1;i>SR;i--)
				{
					
					arr[i][SC]=number;
						number++;
				}
				
				SR++;
				SC++;
				ER--;
				EC--;
			}
			for(int i=0;i<N;i++)
			{for(int j=0;j<N;j++)
					System.out.print(arr[i][j]+" ");
				System.out.println();
			}
		}//main end
		
	}

