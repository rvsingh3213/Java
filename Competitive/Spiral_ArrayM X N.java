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
			//int N=sc.nextInt();
			
			int number=1;
			int SR=0;	// Start Row
			int ER=3-1;	// End Row
			int SC=0;	//Start Col
			int EC=4-1; //End Col
			int arr[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12}};
			while((SR<=ER) && (SC<=EC) )
			{
				for(int i=SC;i<=EC;i++)
					{	System.out.print(arr[SR][i]+" ");
						
					}
					SR++;
					//System.out.println("R1 done");
				for(int i=SR;i<=ER;i++)
					{	System.out.println(arr[i][EC]+" ");
						
						
					}
				EC--;
				
				
				//System.out.println("R2 done");
				if(SR<=ER)
				for(int i=EC;i>=SC;i--)
				{	System.out.println(arr[ER][i]+" ");
					
						
				}
				ER--;
				//System.out.println("R3 done");
				if(SC<=EC)
				for(int i=ER;i>=SR;i--)
				{
					System.out.print(arr[i][SC]+" ");
					
						
				}
				SC++;
				//System.out.println("R4 done");
				
				
			}
			
		}//main end
		
	}

