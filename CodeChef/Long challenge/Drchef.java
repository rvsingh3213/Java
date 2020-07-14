
import java.lang.*;
import java.io.*;
import java.util.*;
class Codechef {
	
	
	static int find(int x,double value)
	{
		int count=0;
		
		int m=(int)(( Math.log(value) -Math.log(x))/Math.log(2));
		
		double addidtion= (( Math.log(value) -Math.log(x))/Math.log(2));
		
		int grav=0;
		
		if(m==addidtion)
		{
			count=(int)(addidtion+1);
		}
		else
		{
			count=(int)(addidtion +2);
		}
		
		if(count-2>0)
		{
			grav=(int)Math.pow(2,count-2);
		}
		else
		{
			grav=1;
		}
		
		grav=(int)(value - grav*x)*2;
		if(x>=value)
		{
			grav=(int)value;
			count=1;
		}
		
		return count;
			
		
	}
	
	
	public static void main (String[] args) throws IOException	
	{

			BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
			
			int test=Integer.parseInt(bf.readLine());
		
			
			
		while(test>0)
		{ test--;
				String line=bf.readLine();
				String str[]=line.trim().split("\\s+");
				
				int N=Integer.parseInt(str[0]);
				
				long x=Long.parseLong(str[1]);
				
				line=bf.readLine();
				
				String str2[]=line.trim().split("\\s+");
				
				long arr[]=new long[N];
				
				for(int i=0;i<N;i++)
					arr[i]=Long.parseLong(str2[i]);
				
				
				Arrays.sort(arr);
				
				int point=0;
				
				for(int i=0;i<N ; i++)
				{
					if(arr[i] > x)
					{
						point =i;
						break;
					}
				}
				
				long din=0L;
				
				din=find((int)x,(double)arr[point]);
				
				for(int i=point +1 ; i <N; i++)
				{	
					din+= find((int)arr[i -1]*2,arr[i]);
				}
				
				din+=(long)point;
				
				System.out.println(din);
				
		}// while test case
		
		
	} // main method
	
	
}// calss end


















