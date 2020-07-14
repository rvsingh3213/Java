

//https://www.codechef.com/JULY20B/problems/CHFNSWPS

import java.lang.*;
import java.io.*;
import java.util.*;
class Codechef {
	public static void main (String[] args) throws IOException	
	{

			BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
			
			int test=Integer.parseInt(bf.readLine());
		
			
			
		while(test>0)
		{ test--;
				
				int N=Integer.parseInt(bf.readLine());
				
				Map<Long,Long> mp1=new TreeMap<>();
				Map<Long,Long> mp2=new TreeMap<>();
				
				long arr[]=new long[N];
				long brr[]=new long[N];
				long A=0L,B=0L,temp=0L,flag=0L;
				long count=0L;
				
				String line=bf.readLine();
				String str[]=line.trim().split("\\s+");
				
				Map<Long,Long> mpc=new TreeMap<>();
				
				
				for(int i=0;i<N;i++)
				{
					A=Long.parseLong(str[i]);
					arr[i]=A;
					/*if(A<min_ALL)
						min_ALL=A;
					*/
					if(mp1.containsKey(A))
					{
						mp1.put(A,mp1.get(A)+1L);
					}
					else
					{
						mp1.put(A,1L);
					}
					
					
					if(mpc.containsKey(A))
					{
						mpc.put(A,mpc.get(A)+1L);
					}
					else
					{
						mpc.put(A,1L);
					}
					
					
				}
				// find min
				
				
				line=bf.readLine();
				str=line.trim().split("\\s+");
			
				
				for(int i=0;i<N;i++)
				{
					A=Long.parseLong(str[i]);
					
					brr[i]=A;
					/*if(A<min_ALL)
						min_ALL=A;
					*/
					if(mp2.containsKey(A))
					{
						mp2.put(A,mp2.get(A)+1L);
					}
					else
					{
						mp2.put(A,1L);
					}
					
					//for combined
					
					if(mpc.containsKey(A))
					{
						mpc.put(A,mpc.get(A)+1L);
					}
					else
					{
						mpc.put(A,1L);
					}
					
				}
				Arrays.sort(arr);
				Arrays.sort(brr);
				
							
				
				
				for(Map.Entry<Long,Long> e: mpc.entrySet())
				{
					if(e.getValue() %2!=0)
					{
						flag=-1L;
						break;
					}
				}
				
				if(flag == -1L)
				{
						System.out.println("-1");
						continue;
				}
				
				ArrayList<Long> list1=new ArrayList<>();
				
				for(Map.Entry<Long,Long> e: mp1.entrySet())
				{
					A=e.getKey();
					B=e.getValue();
					
					if( B > mpc.get(A)/2 )
					{
					//	list1.add(A);
						for(int i=0;i<B-mpc.get(A)/2;i++)
							list1.add(A);
					}
					
				}
				
				ArrayList<Long> list2=new ArrayList<>();
				
				for(Map.Entry<Long,Long> e: mp2.entrySet())
				{
					A=e.getKey();
					B=e.getValue();
					
					if( B > mpc.get(A)/2 )
					{
					//	list1.add(A);
						for(int i=0;i<B-mpc.get(A)/2;i++)
							list2.add(A);
					}
				}
				
				if(list1.size()==0  || list2.size()==0 )
				{	System.out.println("0");
					continue;
				}
				Collections.sort(list1);
				Collections.sort(list2);
				
				//int min_ALL=Math.min(list1.get(0),list2.get(0));
				Collections.reverse(list2);
				
				
				
			//	int min=Math.min(Collections.min(list1),Collections.min(list2));

					
			/*	if(list1.size() != list2.size())
				{System.out.println("0");
			     
				continue;
		            }*/
				
				for(int i=0;i<list1.size();i++)
				{
					long min_ALL=Math.min(arr[0],brr[0]);
					long m=(long)Math.min(list1.get(i),list2.get(i));
					
					count+=(long)Math.min(2*min_ALL,m);
				}
				
				System.out.println(count);
				
				
				      
				
				
				
				
		}// while test case
		
		
	} // main method
	
	
}// calss end