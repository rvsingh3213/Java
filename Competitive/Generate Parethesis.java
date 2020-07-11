
import java.lang.*;
import java.io.*;
import java.util.*;
class Codechef {
	
		static void generator(char arr[],int pos,int open,int close,int N)
		{
			if(pos==(2*N))
			{
				for(int i=0;i<2*N;i++)
					System.out.print(arr[i]);
				
				System.out.println();
				
				return;
			}
			
			
			
			if(open>close)
			{
				arr[pos]=')';
				
				generator(arr,pos+1,open,close+1,N);
			}
			if(open<N)
			{
				arr[pos]='(';
				
				generator(arr,pos+1,open+1,close,N);
			}
			
			//return;

		}
		
	public static void main (String[] args) throws IOException	
	{

			BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
			
			int test=Integer.parseInt(bf.readLine());
		
			
			
		while(test>0)
		{ test--;
				
				int N=Integer.parseInt(bf.readLine());
				char arr[]=new char[2*N];
				
				/*String str[]=*/generator(arr,0,0,0,N);
				/*for(int i=0;i<N;i++)
					System.out.println(str[i]);
				
				*/
		}// while test case
		
		
	} // main method
	
	
}// calss end

