
//https://www.codechef.com/JUNE20B/problems/EOEO
// problem code EOEO

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
			long TS1=sc.nextLong();
			long TS=TS1;
			int z_o=0;
			if(TS==1)
			{	
				System.out.println(z_o);
				continue;
			}
			if((TS%2)==1)
			{	//System.out.println("odd");
				System.out.println(TS/2);
				continue;
			}
			else
			{
				int num_2=0;
				
				while(TS!=0)
				{
					if(TS%2==0)
					{ num_2++;
					  TS/=2;
					  if(TS%2==1)
						  break;
						
					}
					else
						break;
					
				}
			//	System.out.println("num:"+num_2);
				long ll=(long)Math.pow(2,num_2);
				//System.out.println("ll:"+ll);
				//ll+=2;
				long count=0;
				if(TS==0)
				{System.out.println(count);
					continue;
					}
				
				ll*=2;
				long ini_tial=ll;
			     // count++;
				
			      /*	while(ll<=TS1)
				{
					count
					ll+=ini_tial;
					
				}*/
				
				
				System.out.println((TS1)/ll);
				
			}
	
		}
	}
}
