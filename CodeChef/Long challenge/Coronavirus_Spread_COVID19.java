

Coronavirus Spread Problem Code: COVID19

//CodeChef May Challenge 2020

//https://www.codechef.com/MAY20B/problems/COVID19


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
				int arr[]=new int[N];
				for(int i=0;i<N;i++)
					arr[i]=sc.nextInt();
				
				int dis[]=new int[N-1];
				for(int i=0;i<N-1;i++)
				{
					dis[i]=arr[i+1]-arr[i];
				}
				
				
				if(N==2)
				{
					if(dis[0]>2)
					{System.out.println("1 "+"1");
					 }
					else
				   {System.out.println("2 "+"2");}
				}
				
				
				if(N==3)
				{	if(dis[0]<3)
					{
						if(dis[1]<3)
							System.out.println("3 "+"3");
						else
							System.out.println("1 "+"2");
					}
					else
					{
						if(dis[1]>=3)
							System.out.println("1 "+"1");
						else
							System.out.println("1 "+"2");
					}
				}
				//System.out.println(best+" "+worst);
				int count=0;
				int best=Integer.MAX_VALUE; int flag_b=0;
				int worst=1;
				if(N>3)
				{
				for(int i=0;i<N-1;i++)
				{	if( (i==0) )
					if( (dis[0]>=3) )
					{flag_b=1;best=1;continue;
					}	
					if(i==(N-2))
					if(dis[N-2]>=3)
					{flag_b=1;best=1;continue;
					}
					
					if(i==0)
					{
						if(dis[i]<3)
						count+=2;
						continue;
						
					}
					if(dis[i]<3)
					{	
						if(dis[i-1]>=3)
						{count=2;/*System.out.println(count+"hpn");*/}
						else
						{	
						count++;
						}
						if(worst<count)
						{worst=count;/*System.out.println(i+"run");*/}
						
						
					}
					if(dis[i]>=3)
					{	
						if(dis[i-1]>=3)
						{flag_b=1;best=1;}
						if(flag_b==0)
						{
							if(count<best)
							{best=count;flag_b=1;}
						}
						if(worst<count)
						{worst=count;count=0;}
					}
					if(worst<count)
						worst=count;
						
					if(i==(N-2))//at End if we can get best best
					{
					      if(count<best)
					      best=count;
					}
				}
				/*if(flag_b==0)
				System.out.println(worst+ " "+worst);
				else*/
				System.out.println(best+" "+worst);
				}//if(N>3) ended
			}
		}
	}
